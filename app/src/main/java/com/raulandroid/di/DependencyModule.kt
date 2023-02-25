package com.raulandroid.di

import android.content.Context
import androidx.room.Room
import com.raulandroid.database.RaulDatabase
import com.raulandroid.repository.RaulRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DependencyModule {

    @Singleton
    @Provides
    fun provideRepository(): RaulRepository = RaulRepository()

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext appContext: Context): RaulDatabase =
        Room.databaseBuilder(
            appContext,
            RaulDatabase::class.java,
            "RaulDatabase"
        ).build()

}