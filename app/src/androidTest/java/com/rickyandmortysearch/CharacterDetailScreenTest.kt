package com.rickyandmortysearch

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.assertIsDisplayed
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.rickyandmortysearch.data.model.Character
import com.rickyandmortysearch.data.model.Location
import com.rickyandmortysearch.data.model.Origin
import com.rickyandmortysearch.ui.screens.CharacterDetailScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class CharacterDetailScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun characterDetailScreen_displaysCorrectInformation() {
        // Given
        val character = Character(
            id = 1,
            name = "Rick Sanchez",
            status = "Alive",
            species = "Human",
            type = "",
            gender = "Male",
            origin = Origin("Earth", ""),
            location = Location("Earth", ""),
            image = "https://example.com/rick.jpg",
            episode = listOf(),
            url = "",
            created = "2017-11-04T18:48:46.250Z"
        )

        // When
        composeTestRule.setContent {
            CharacterDetailScreen(character = character)
        }

        // Then
        composeTestRule.onNodeWithText("Rick Sanchez").assertIsDisplayed()
        composeTestRule.onNodeWithText("Species: Human").assertIsDisplayed()
        composeTestRule.onNodeWithText("Status: Alive").assertIsDisplayed()
        composeTestRule.onNodeWithText("Origin: Earth").assertIsDisplayed()
        composeTestRule.onNodeWithText("Created: Nov 04, 2017").assertIsDisplayed()
    }
}
