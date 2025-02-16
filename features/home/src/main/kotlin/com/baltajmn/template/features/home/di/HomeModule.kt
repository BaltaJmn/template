package com.baltajmn.template.features.home.di

import com.baltajmn.template.features.home.presentation.screen.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.dsl.module

val HomeModule = module {
    includes(
        HomeDataModule,
        HomeDomainModule,
        HomePresentationModule
    )
}

private val HomeDataModule: Module
    get() = module {}

private val HomeDomainModule: Module
    get() = module {}

private val HomePresentationModule: Module
    get() = module {
        viewModelOf(::HomeViewModel)
    }