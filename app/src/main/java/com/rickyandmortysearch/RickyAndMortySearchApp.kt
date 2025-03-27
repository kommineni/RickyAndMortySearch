package com.rickyandmortysearch

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.rickyandmortysearch.ui.navigation.RickyAndMortyNavigation

/**
 * This class used when we want expand or scale application
 * For example: If we want to add Top Bar or Bottom Navigation to the app. We will simply create the Scaffold and pass topbar and bottombar
 */
@Composable
fun RickAndMortyApp() {
    val navController = rememberNavController()
    Surface(
        modifier = Modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        RickyAndMortyNavigation(navController)
    }

}
