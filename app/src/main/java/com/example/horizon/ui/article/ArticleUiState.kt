package com.example.horizon.ui.article

import com.example.horizon.data.model.Post

sealed interface ArticleUiState {

    data object Loading : ArticleUiState

    data class Success(
        val post: Post
    ) : ArticleUiState

    data object Error : ArticleUiState
}