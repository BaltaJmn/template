package com.baltajmn.template.features.splash.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.dsl.module
import com.baltajmn.template.features.splash.presentation.screen.SplashViewModel

val SplashModule = module {
    includes(
        SplashDataModule,
        SplashDomainModule,
        SplashPresentationModule
    )
}

private val SplashDataModule: Module
    get() = module {}

private val SplashDomainModule: Module
    get() = module {}

private val SplashPresentationModule: Module
    get() = module {
        viewModelOf(::SplashViewModel)
    }