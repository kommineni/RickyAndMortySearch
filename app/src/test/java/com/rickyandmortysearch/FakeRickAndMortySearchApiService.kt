package com.rickyandmortysearch

import com.rickyandmortysearch.data.model.CharacterResponse
import com.rickyandmortysearch.data.network.api.RickAndMortySearchApiService
import util.MockData

class FakeRickAndMortySearchApiService : RickAndMortySearchApiService {

    override suspend fun searchByCharacters(name: String): CharacterResponse {
        val filteredCharacters = if (name.isBlank()) {
            emptyList()
        } else {
            MockData.sampleCharacterList.filter { it.name.contains(name, ignoreCase = true) }
        }
        return CharacterResponse(
            info = MockData.sampleInfo,
            filteredCharacters)
    }
}