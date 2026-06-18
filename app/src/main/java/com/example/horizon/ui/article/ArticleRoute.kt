package com.example.horizon.ui.article

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun ArticleRoute(
    viewModel: ArticleViewModel
) {

    val uiState by viewModel.uiState.collectAsState()

    when (val state = uiState) {

        ArticleUiState.Loading -> {
            Text("Loading...")
        }

        ArticleUiState.Error -> {
            Text("Post not found")
        }

        is ArticleUiState.Success -> {
            ArticleScreen(post = state.post)
        }
    }
}