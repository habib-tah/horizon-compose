package com.example.horizon.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeArticleScreen(
    homeContent: @Composable () -> Unit,
    articleContent: @Composable () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .weight(0.38f)
                .fillMaxHeight()
        ) {
            homeContent()
        }

        VerticalDivider(
            modifier = Modifier.fillMaxHeight()
        )

        Box(
            modifier = Modifier
                .weight(0.62f)
                .fillMaxHeight()
        ) {
            articleContent()
        }
    }
}