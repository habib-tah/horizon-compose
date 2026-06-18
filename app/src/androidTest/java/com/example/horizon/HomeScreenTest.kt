package com.example.horizon

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomeScreenTest {

    @get:Rule
    val composeRule =
        createAndroidComposeRule<MainActivity>()

    @Test
    fun homeScreen_displaysTitle() {

        composeRule
            .onNodeWithText(
                "Explore stories that shape the world"
            )
            .assertExists()
    }

    @Test
    fun homeScreen_displaysFeaturedArticleSummary() {

        composeRule
            .onNodeWithText(
                "New generations of telescopes are helping scientists",
                substring = true
            )
            .assertExists()
    }
}