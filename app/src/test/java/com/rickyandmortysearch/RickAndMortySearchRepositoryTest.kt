package com.rickyandmortysearch

import com.rickyandmortysearch.data.repository.RickAndMortySearchRepository
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class RickAndMortySearchRepositoryTest {

    private lateinit var repository: RickAndMortySearchRepository
    private lateinit var apiService: FakeRickAndMortySearchApiService

    @Before
    fun setup() {
        apiService = FakeRickAndMortySearchApiService()
        repository = RickAndMortySearchRepository(apiService)
    }

    @Test
    fun `searchCharacters returns correct results`() = runTest() {
        val characters = repository.searchCharacters("Rick")
        assertEquals(1, characters.size)
        assertEquals("Rick Sanchez", characters[0].name)
    }

    @Test
    fun `searchCharacters with non-matching query returns empty list`() = runTest {
        val characters = repository.searchCharacters("Nonexistent")
        assertTrue(characters.isEmpty())
    }
}
