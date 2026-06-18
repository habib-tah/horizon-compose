package com.example.horizon

import org.junit.Test
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTest {

    @get:Rule
    val composeRule =
        createAndroidComposeRule<MainActivity>()

    @Test
    fun app_launches() {

        composeRule
            .onNodeWithText(
                "Explore stories that shape the world"
            )
            .assertExists()
    }

    @Test
    fun phone_openArticleScreen() {

        composeRule
            .onNodeWithText(
                "The Future of Space Telescopes",
                substring = true
            )
            .performClick()

        composeRule
            .onNodeWithText(
                "For centuries, astronomers have searched the night sky with increasingly powerful instruments.",
                substring = true
            )
            .assertExists()
    }

    @Test
    fun tablet_displaysHomeAndArticleTogether() {

        composeRule
            .onNodeWithTag("home_screen")
            .assertExists()

        composeRule
            .onNodeWithTag("article_screen")
            .assertExists()
    }
}