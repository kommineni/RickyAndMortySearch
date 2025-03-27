package com.rickyandmortysearch.ui.uistate

import com.rickyandmortysearch.data.model.Character

/**
 * This Data class hold different states of the search webservice call
 */
data class SearchUiState (
    var query: String = "",
    val characters: List<Character> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)