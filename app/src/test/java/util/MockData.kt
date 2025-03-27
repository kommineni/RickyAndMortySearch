package util

import com.rickyandmortysearch.data.model.Info
import com.rickyandmortysearch.data.model.Location
import com.rickyandmortysearch.data.model.Origin
import com.rickyandmortysearch.data.model.Character

object MockData {

    val sampleInfo = Info(
        count = 826,  // Total number of characters
        pages = 42,   // Total number of pages
        next = "https://rickandmortyapi.com/api/character/?page=2",  // URL for the next page
        prev = ""   // No previous page for the first page
    )
    val sampleCharacterList = listOf(
        Character(
            created = "2017-11-04T18:48:46.250Z",
            episode = listOf("https://rickandmortyapi.com/api/episode/1", "https://rickandmortyapi.com/api/episode/2"),
            gender = "Male",
            id = 1,
            image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
            location = Location("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
            name = "Rick Sanchez",
            origin = Origin("Earth (C-137)", "https://rickandmortyapi.com/api/location/1"),
            species = "Human",
            status = "Alive",
            type = "",
            url = "https://rickandmortyapi.com/api/character/1"
        ),
        Character(
            created = "2017-11-04T18:50:21.651Z",
            episode = listOf("https://rickandmortyapi.com/api/episode/1", "https://rickandmortyapi.com/api/episode/2", "https://rickandmortyapi.com/api/episode/3"),
            gender = "Male",
            id = 2,
            image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg",
            location = Location("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
            name = "Morty Smith",
            origin = Origin("Earth (C-137)", "https://rickandmortyapi.com/api/location/1"),
            species = "Human",
            status = "Alive",
            type = "",
            url = "https://rickandmortyapi.com/api/character/2"
        ),
        Character(
            created = "2017-11-04T19:09:56.428Z",
            episode = listOf("https://rickandmortyapi.com/api/episode/6", "https://rickandmortyapi.com/api/episode/7"),
            gender = "Female",
            id = 3,
            image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg",
            location = Location("Abadango", "https://rickandmortyapi.com/api/location/2"),
            name = "Summer Smith",
            origin = Origin("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
            species = "Human",
            status = "Alive",
            type = "",
            url = "https://rickandmortyapi.com/api/character/3"
        ),
        Character(
            created = "2017-11-04T19:22:43.665Z",
            episode = listOf("https://rickandmortyapi.com/api/episode/10", "https://rickandmortyapi.com/api/episode/11"),
            gender = "Female",
            id = 4,
            image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg",
            location = Location("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
            name = "Beth Smith",
            origin = Origin("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
            species = "Human",
            status = "Alive",
            type = "",
            url = "https://rickandmortyapi.com/api/character/4"
        ),
        Character(
            created = "2017-11-04T19:26:56.301Z",
            episode = listOf("https://rickandmortyapi.com/api/episode/15", "https://rickandmortyapi.com/api/episode/16"),
            gender = "Male",
            id = 5,
            image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg",
            location = Location("Interdimensional Cable", "https://rickandmortyapi.com/api/location/6"),
            name = "Jerry Smith",
            origin = Origin("Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/location/20"),
            species = "Human",
            status = "Alive",
            type = "",
            url = "https://rickandmortyapi.com/api/character/5"
        )
    )

}