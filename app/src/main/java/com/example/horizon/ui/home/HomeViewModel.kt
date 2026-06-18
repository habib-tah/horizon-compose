package com.example.horizon.ui.home

import androidx.lifecycle.ViewModel
import com.example.horizon.data.model.Post
import com.example.horizon.data.repository.PostsRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.horizon.data.model.Category
import com.example.horizon.ui.horizonApplication
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.SharingStarted

class HomeViewModel(
    private val repository: PostsRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<HomeUiState>(
            HomeUiState.Loading
    )

    val uiState: StateFlow<HomeUiState> = _uiState

    private val _selectedCategory =
        MutableStateFlow<CategoryFilterState>(
            CategoryFilterState.All
        )

    val selectedCategory: StateFlow<CategoryFilterState> =
        _selectedCategory

    private val _selectedPostId =
        MutableStateFlow<String?>(null)

    val selectedPostId: StateFlow<String?> =
        _selectedPostId

    val filteredPosts: StateFlow<List<Post>> =
        combine(
            uiState,
            selectedCategory
        ) { state, selectedCategory ->

            if (state !is HomeUiState.Success) {
                return@combine emptyList()
            }

            when (selectedCategory) {

                CategoryFilterState.All -> {
                    state.posts
                }

                is CategoryFilterState.Selected -> {
                    state.posts.filter { post ->
                        post.category ==
                                selectedCategory.category
                    }
                }
            }
        }.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    init {
        loadPosts()
    }

    private fun loadPosts() {
        val posts = repository.getPosts()

        _uiState.value =
            HomeUiState.Success(posts)

        if (_selectedPostId.value == null) {
            _selectedPostId.value = posts.firstOrNull()?.id
        }
    }

    fun selectPost(postId: String) {
        _selectedPostId.value = postId
    }

    fun onCategorySelected(category: Category?) {
        _selectedCategory.value =
            if (category == null) {
                CategoryFilterState.All
            } else {
                CategoryFilterState.Selected(category)
            }

        val posts = when (category) {

            null -> repository.getPosts()

            else -> repository.getPosts().filter {
                it.category == category
            }
        }

        _selectedPostId.value =
            posts.firstOrNull()?.id
    }

    companion object {

        val Factory: ViewModelProvider.Factory =
            viewModelFactory {

                initializer {

                    val application = horizonApplication()

                    HomeViewModel(
                        repository =
                            application.container.postsRepository
                    )
                }
            }
    }
}