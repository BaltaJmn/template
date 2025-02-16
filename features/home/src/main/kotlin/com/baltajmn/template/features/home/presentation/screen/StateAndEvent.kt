package com.baltajmn.template.features.home.presentation.screen

import androidx.compose.runtime.Immutable

@Immutable
data class HomeState(
    val isLoading: Boolean = false
)

interface Event