package com.rickyandmortysearch

import com.rickyandmortysearch.data.model.Character
import com.rickyandmortysearch.data.repository.RickAndMortySearchRepository

class FakeRickAndMortySearchRepository : RickAndMortySearchRepository(FakeRickAndMortySearchApiService()) {
    var shouldThrowException = false

    override suspend fun searchCharacters(name: String): List<Character> {
        if (shouldThrowException) {
            throw Exception("An error occurred")
        }
        return super.searchCharacters(name)
    }
}