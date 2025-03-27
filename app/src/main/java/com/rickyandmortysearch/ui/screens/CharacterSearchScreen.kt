package com.rickyandmortysearch.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.google.gson.Gson
import com.rickyandmortysearch.ui.viewmodel.CharacterSearchViewModel
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@Composable
fun CharacterSearchScreen(
    navController: NavController,
    viewModel: CharacterSearchViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    Column(modifier = Modifier.fillMaxSize()) {
        SearchBar(
            query = uiState.query,
            onQueryChange = viewModel::onSearchQueryChanged,
            onSearch = viewModel::getSearchResult,
            modifier = Modifier.padding(16.dp)
        )
        when {
            uiState.isLoading -> LoadingScreen()
            false -> ErrorScreen(message = uiState.error ?: "Unknown Error")
            else ->{
                CharacterGrid(
                    characters = uiState.characters,
                    onItemClick = {
                        val character = URLEncoder.encode(Gson().toJson(it), StandardCharsets.UTF_8.toString())
                        navController.navigate("detail/${character}")
                    }
                )
            }
        }
    }
}

