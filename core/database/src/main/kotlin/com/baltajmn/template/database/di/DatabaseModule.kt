package com.baltajmn.template.database.di

import androidx.room.Room
import com.baltajmn.template.database.datasource.AppDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val DatabaseModule = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            AppDatabase::class.java,
            "app_database"
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}