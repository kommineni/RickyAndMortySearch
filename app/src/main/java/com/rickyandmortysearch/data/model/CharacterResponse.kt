package com.rickyandmortysearch.data.model

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    val info: Info,
    @SerializedName("results")
    val characters: List<Character>
)