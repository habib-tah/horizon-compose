package com.example.horizon.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.example.horizon.data.repository.PostsRepository
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.horizon.ui.article.ArticleScreen

@Composable
fun HomeArticleRoute(
    viewModel: HomeViewModel,
    repository: PostsRepository
) {

    val uiState by viewModel.uiState.collectAsState()

    val filteredPosts by viewModel.filteredPosts.collectAsState()

    val selectedCategory by viewModel.selectedCategory.collectAsState()

    val selectedPostId by viewModel.selectedPostId.collectAsState()

    val selectedPost =
        selectedPostId?.let {
            repository.getPost(it)
        }

    HomeArticleScreen(

        homeContent = {

            HomeScreen(
                uiState = uiState,
                onPostClick = viewModel::selectPost,
                selectedCategory = selectedCategory,
                onCategorySelected = viewModel::onCategorySelected,
                posts = filteredPosts
            )
        },

        articleContent = {

            if (selectedPost != null) {

                ArticleScreen(
                    post = selectedPost
                )

            } else {

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Select an article")
                }
            }
        }
    )
}