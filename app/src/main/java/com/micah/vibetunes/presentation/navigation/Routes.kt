package com.micah.vibetunes.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
object HomeRoute

@Serializable
object SongsRoute

@Serializable
object SearchRoute

@Serializable
object PlaylistsRoute

@Serializable
object SettingsRoute

@Serializable
object ProfileRoute
@Serializable
object MainRoute

@Serializable
object SplashRoute


@Serializable
data class PlayerRoute(val songId: String = "default")

@Serializable
data class PlaylistRoute(val playlistId: String)

@Serializable
data class ArtistRoute(val artistId: String)