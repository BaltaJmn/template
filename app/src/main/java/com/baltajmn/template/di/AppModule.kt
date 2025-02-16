package com.baltajmn.template.di

import com.baltajmn.template.core.common.dispatchers.DispatchersModule
import com.baltajmn.template.core.persistence.di.PersistenceModule
import com.baltajmn.template.features.home.di.HomeModule
import com.baltajmn.template.features.splash.di.SplashModule
import org.koin.core.module.Module
import org.koin.dsl.module

val CoreModules: Module
    get() = module {
        includes(
            listOf(
                DispatchersModule,
                PersistenceModule,
            )
        )
    }

val FeaturesModule: Module
    get() = module {
        includes(
            listOf(
                SplashModule,
                HomeModule,
            )
        )
    }