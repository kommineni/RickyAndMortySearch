package com.rickyandmortysearch

import com.rickyandmortysearch.ui.viewmodel.CharacterSearchViewModel
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNull
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test


@ExperimentalCoroutinesApi
class CharacterSearchViewModelTest {

    private lateinit var viewModel: CharacterSearchViewModel
    private lateinit var repository: FakeRickAndMortySearchRepository
    private val testDispatcher = TestCoroutineDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)
        repository = FakeRickAndMortySearchRepository()
        viewModel = CharacterSearchViewModel(repository)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        testDispatcher.cleanupTestCoroutines()
    }

    @Test
    fun `when search query changes, uiState is updated`() = runTest {
        viewModel.onSearchQueryChanged("Rick")
        assertEquals("Rick", viewModel.uiState.value.query)
    }

    @Test
    fun `when getSearchResult is called, characters are fetched and uiState is updated`() = runTest {
        viewModel.onSearchQueryChanged("Rick")
        viewModel.getSearchResult()

        assertEquals(false, viewModel.uiState.value.isLoading)
        assertEquals(1, viewModel.uiState.value.characters.size)
        assertEquals("Rick Sanchez", viewModel.uiState.value.characters[0].name)
        assertNull(viewModel.uiState.value.error)
    }

    @Test
    fun `when getSearchResult throws exception, error is set in uiState`() = runTest {
        repository.shouldThrowException = true
        viewModel.getSearchResult()

        assertEquals(false, viewModel.uiState.value.isLoading)
        assertEquals("An error occurred", viewModel.uiState.value.error)
        assertTrue(viewModel.uiState.value.characters.isEmpty())
    }

    @Test
    fun `when search query matches no characters, empty list is returned`() = runTest {
        viewModel.onSearchQueryChanged("Nonexistent")
        viewModel.getSearchResult()

        assertTrue(viewModel.uiState.value.characters.isEmpty())
    }
}