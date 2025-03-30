package com.baltajmn.template.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.baltajmn.template.core.design.ui.theme.AppTheme
import com.baltajmn.template.core.navigation.GRAPH

@Composable
fun AppContent(appState: AppState = rememberAppState()) {
    AppTheme {
        NavHost(
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