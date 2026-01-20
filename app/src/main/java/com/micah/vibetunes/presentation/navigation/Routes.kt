package com.micah.vibetunes.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.PlaylistPlay
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

@Serializable
sealed interface Destination{
    val icon: ImageVector
    val label: String

    @Serializable
    data object Home : Destination {
        override val icon = Icons.Default.Home
        override val label = "Home"
    }

    @Serializable
    data object Songs : Destination {
        override val icon = Icons.Default.MusicNote
        override val label = "Songs"
    }

    @Serializable
    data object Playlists : Destination{
        override val icon = Icons.Filled.PlaylistPlay
        override val label = "Playlists"
    }

    @Serializable
    data object Settings : Destination {
        override val icon = Icons.Default.Settings
        override val label = "Settings"
    }
}
