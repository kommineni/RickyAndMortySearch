package com.rickyandmortysearch.data.network.api

import com.rickyandmortysearch.data.model.CharacterResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMortySearchApiService {

    @GET("api/character/")
    suspend fun searchByCharacters(@Query("name") name: String): CharacterResponse
}