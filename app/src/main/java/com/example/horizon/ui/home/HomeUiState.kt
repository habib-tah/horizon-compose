package com.example.horizon.ui.home

import com.example.horizon.data.model.Post

sealed interface HomeUiState {

    data object Loading : HomeUiState

    data class Success(
        val posts: List<Post>
    ) : HomeUiState

    data class Error(
        val message: String
    ) : HomeUiState
}