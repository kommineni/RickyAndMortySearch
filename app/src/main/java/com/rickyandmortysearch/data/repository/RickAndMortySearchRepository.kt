package com.rickyandmortysearch.data.repository

import com.rickyandmortysearch.data.model.Character
import com.rickyandmortysearch.data.network.api.RickAndMortySearchApiService

open class RickAndMortySearchRepository(
    private val apiService: RickAndMortySearchApiService
) {
   open suspend fun searchCharacters(name: String): List<Character> =  apiService.searchByCharacters(name = name).characters
}