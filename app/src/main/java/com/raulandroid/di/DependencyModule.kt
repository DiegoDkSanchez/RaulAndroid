package com.raulandroid.di

import com.raulandroid.repository.RaulRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DependencyModule {

    @Singleton
    @Provides
    fun provideRepository() : RaulRepository = RaulRepository()

}