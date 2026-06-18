package com.example.horizon.ui.article

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.horizon.data.repository.PostsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.horizon.ui.horizonApplication

class ArticleViewModel(
    private val repository: PostsRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _uiState =
        MutableStateFlow<ArticleUiState>(
            ArticleUiState.Loading
        )

    val uiState: StateFlow<ArticleUiState> = _uiState

    init {

        val postId = savedStateHandle.get<String>("postId")

        if (postId != null) {
            loadPost(postId)
        }  else {
            _uiState.value = ArticleUiState.Error
        }
    }

    private fun loadPost(id: String) {
        val post = repository.getPost(id)

        _uiState.value =
            if (post != null) {
                ArticleUiState.Success(post)
            } else {
                ArticleUiState.Error
            }
    }

    companion object {

        val Factory: ViewModelProvider.Factory =
            viewModelFactory {

                initializer {

                    val application = horizonApplication()

                    ArticleViewModel(
                        repository =
                            application.container.postsRepository,
                        savedStateHandle =
                            createSavedStateHandle()
                    )
                }
            }
    }
}