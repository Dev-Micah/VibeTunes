package com.micah.vibetunes.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.micah.vibetunes.presentation.screens.home.HomeScreen
import com.micah.vibetunes.presentation.screens.playlists.PlaylistsScreen
import com.micah.vibetunes.presentation.screens.settings.SettingsScreen
import com.micah.vibetunes.presentation.screens.songs.SongsScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Destination.Home,
        modifier = modifier
    ) {
        composable<Destination.Home> { HomeScreen() }
        composable<Destination.Songs> { SongsScreen() }
        composable<Destination.Playlists> { PlaylistsScreen() }
        composable<Destination.Settings> { SettingsScreen() }
    }
}