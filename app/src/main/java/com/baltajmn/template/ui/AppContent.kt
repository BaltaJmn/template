package com.baltajmn.template.ui

import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.baltajmn.template.core.design.theme.AppTheme
import com.baltajmn.template.core.navigation.GRAPH

@Composable
fun AppContent(appState: AppState = rememberAppState()) {
    AppTheme {
        NavHost(
            modifier = Modifier.background(color = MaterialTheme.colorScheme.background),
            navController = appState.preMainNavController,
            route = GRAPH.Root,
            startDestination = GRAPH.PreMain,
        ) {
            preMainNavGraph(appState = appState)
            composable(GRAPH.Main) {
                MainNavGraph(appState = appState)
            }
        }
    }
}