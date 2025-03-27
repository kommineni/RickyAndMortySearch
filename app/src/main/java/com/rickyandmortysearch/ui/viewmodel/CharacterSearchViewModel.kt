package com.rickyandmortysearch.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rickyandmortysearch.data.repository.RickAndMortySearchRepository
import com.rickyandmortysearch.ui.uistate.SearchUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * This view model hold the core business logic to get the data from the web-service and update to the UI through State management
 */
@HiltViewModel
class CharacterSearchViewModel @Inject constructor(
    private val repository: RickAndMortySearchRepository
): ViewModel() {
    private val _uiState = MutableStateFlow(SearchUiState())
    val uiState: StateFlow<SearchUiState> = _uiState.asStateFlow()

    init {
        // This will fetch data very first time user launch the app.
        _uiState.value.query = "Smith"
        getSearchResult()
    }

    /**
     * This manage web-service status like Loading, Success or Failure
     * Retrieve the data from the  server.
     * If it fail to load the we will update error status
     *
     */

    fun getSearchResult(){
        viewModelScope.launch{
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            try {
                val characters = repository.searchCharacters(_uiState.value.query)
                _uiState.value = _uiState.value.copy(
                    characters = characters,
                    isLoading = false
                )
            }catch(e : Exception){
                _uiState.value = _uiState.value.copy(
                    error = e.message ?: "An unknown error occurred",
                    isLoading = false
                )
            }
        }
    }

    /**
     * To hold the current search key and pass it when we are typing in the search bar
     */
    fun onSearchQueryChanged(query: String) {
        _uiState.value = _uiState.value.copy(query = query)
    }

}