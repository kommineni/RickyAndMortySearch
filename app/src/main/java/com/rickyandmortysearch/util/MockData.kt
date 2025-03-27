package com.rickyandmortysearch.util

import com.rickyandmortysearch.data.model.Location
import com.rickyandmortysearch.data.model.Origin
import com.rickyandmortysearch.data.model.Character

object MockData {
     val sampleCharacters = listOf(
        Character(
            id = 1,
            name = "Rick Sanchez",
            status = "Alive",
            species = "Human",
            type = "",
            gender = "Male",
            origin = Origin("Earth", ""),
            location = Location("Earth", ""),
            image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
            episode = listOf(),
            url = "",
            created = ""
        ),
        Character(
            id = 2,
            name = "Morty Smith",
            status = "Alive",
            species = "Human",
            type = "",
            gender = "Male",
            origin = Origin("Earth", ""),
            location = Location("Earth", ""),
            image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg",
            episode = listOf(),
            url = "",
            created = ""
        )
    )
}