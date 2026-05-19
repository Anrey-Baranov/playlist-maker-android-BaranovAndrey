package com.example.playlistmaker.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playlistmaker.ui.theme.MyPlaylistMakerTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    onSearchClick: () -> Unit,
    onSettingsClick: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Playlist maker") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(horizontal = 16.dp)
        ) {

            MenuItem(
                text = "Поиск",
                icon = Icons.Default.Search,
                onClick = onSearchClick
            )

            MenuItem(
                text = "Плейлисты",
                icon = Icons.Default.List,
                onClick = {}
            )

            MenuItem(
                text = "Избранное",
                icon = Icons.Default.FavoriteBorder,
                onClick = {}
            )

            MenuItem(
                text = "Настройки",
                icon = Icons.Default.Settings,
                onClick = onSettingsClick
            )
        }
    }
}

@Preview
@Composable
fun MainPreview() {
    MyPlaylistMakerTheme() {
        Surface() {
            MainScreen(
                onSearchClick = {},
                onSettingsClick = {}
            )
        }
    }
}