package com.micah.vibetunes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.micah.vibetunes.presentation.navigation.AppNavHost
import com.micah.vibetunes.ui.theme.VibeTunesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VibeTunesTheme {
                AppNavHost()
            }
        }
    }
}
