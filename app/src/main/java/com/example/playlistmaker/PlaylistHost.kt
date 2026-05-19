package com.example.playlistmaker


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.playlistmaker.ui.MainScreen
import com.example.playlistmaker.ui.Screen
import com.example.playlistmaker.ui.SettingsScreen
import com.example.playlistmaker.ui.screen.SearchScreen

@Composable
fun PlaylistHost(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.MAIN.name
    ) {

        composable(Screen.MAIN.name) {
            MainScreen(
                onSearchClick = {
                    navController.navigate(Screen.SEARCH.name)
                },
                onSettingsClick = {
                    navController.navigate(Screen.SETTINGS.name)
                }
            )
        }

        composable(Screen.SEARCH.name) {
            SearchScreen(
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(Screen.SETTINGS.name) {
            SettingsScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}