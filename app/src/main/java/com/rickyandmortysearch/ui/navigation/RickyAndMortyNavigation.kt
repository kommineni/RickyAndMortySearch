package com.rickyandmortysearch.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.google.gson.Gson
import com.rickyandmortysearch.data.model.Character
import com.rickyandmortysearch.ui.screens.CharacterDetailScreen
import com.rickyandmortysearch.ui.screens.CharacterSearchScreen

@Composable
fun RickyAndMortyNavigation(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = "search"
    ) {
        composable("search") {
            CharacterSearchScreen(navController = navController)
        }
        composable(
            "detail/{character}",
            arguments = listOf(navArgument("character") { type = NavType.StringType })
        ) { backStackEntry ->
            val json = backStackEntry.arguments?.getString("character")
            val character = json?.let { Gson().fromJson(it, Character::class.java) }
            CharacterDetailScreen(
                character = character,
            )
        }
    }
}
