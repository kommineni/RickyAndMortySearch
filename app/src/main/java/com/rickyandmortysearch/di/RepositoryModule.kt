package com.rickyandmortysearch.di

import com.rickyandmortysearch.data.network.api.RickAndMortySearchApiService
import com.rickyandmortysearch.data.repository.RickAndMortySearchRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideRickAndMortyRepository(apiService: RickAndMortySearchApiService): RickAndMortySearchRepository {
        return RickAndMortySearchRepository(apiService)
    }
}
