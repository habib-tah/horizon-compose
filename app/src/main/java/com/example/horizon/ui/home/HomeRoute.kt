package com.example.horizon.ui.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun HomeRoute(
    viewModel: HomeViewModel,
    onPostClick: (String) -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    val filteredPosts by viewModel.filteredPosts.collectAsState()
    val selectedCategory by viewModel.selectedCategory.collectAsState()

    HomeScreen(
        uiState = uiState,
        onPostClick = onPostClick,
        selectedCategory = selectedCategory,
        posts = filteredPosts,
        onCategorySelected = viewModel::onCategorySelected
    )
}