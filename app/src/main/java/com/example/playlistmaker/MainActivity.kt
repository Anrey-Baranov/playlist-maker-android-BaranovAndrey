package com.example.playlistmaker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.playlistmaker.ui.theme.MyPlaylistMakerTheme  // ← добавить импорт

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyPlaylistMakerTheme {  // ← ОБЕРНИ В ТЕМУ
                val navController = rememberNavController()
                PlaylistHost(navController = navController)
            }
        }
    }
}