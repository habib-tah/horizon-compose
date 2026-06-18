package com.example.horizon.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.example.horizon.data.model.Category
import com.example.horizon.data.model.Post
import com.example.horizon.ui.components.FeaturedPostCard
import com.example.horizon.ui.components.PostCard
import com.example.horizon.ui.theme.Dimensions

@Composable
fun HomeScreen(
    uiState: HomeUiState,
    onPostClick: (String) -> Unit,
    selectedCategory: CategoryFilterState,
    onCategorySelected: (Category?) -> Unit,
    posts: List<Post>
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .testTag("home_screen"),
        contentPadding = PaddingValues(
            horizontal = Dimensions.SpaceMedium,
            vertical = Dimensions.SpaceLarge
        ),
        verticalArrangement = Arrangement.spacedBy(Dimensions.SpaceLarge)
    ) {

        item {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.padding(top = Dimensions.SpaceSmall)
            ) {

                Text(
                    text = "Discover ideas worth exploring",
                    style = MaterialTheme.typography.headlineSmall,
                    lineHeight = MaterialTheme.typography.headlineMedium.lineHeight
                )

                LazyRow(
                    horizontalArrangement =
                        Arrangement.spacedBy(Dimensions.SpaceSmall)
                ) {
                    item {
                        val isAllSelected = selectedCategory is CategoryFilterState.All

                        AssistChip(
                            onClick = {
                                onCategorySelected(null)
                            },
                            label = { Text("All") },
                            colors = AssistChipDefaults.assistChipColors(
                                containerColor =
                                    if (isAllSelected)
                                        MaterialTheme.colorScheme.primaryContainer
                                    else
                                        MaterialTheme.colorScheme.surfaceVariant
                            )
                        )
                    }

                    items(Category.entries) { category ->
                        val isSelected =
                            selectedCategory is CategoryFilterState.Selected &&
                                    selectedCategory.category == category

                        AssistChip(
                            onClick = {
                                onCategorySelected(category)
                            },
                            label = {
                                Text(category.displayName)
                            },
                            colors = AssistChipDefaults.assistChipColors(
                                containerColor =
                                    if (isSelected)
                                        MaterialTheme.colorScheme.primaryContainer
                                    else
                                        MaterialTheme.colorScheme.surfaceVariant
                            )
                        )
                    }
                }

            }
        }

        when (uiState) {

            HomeUiState.Loading -> {
                item {
                    Text("Loading...")
                }
            }

            is HomeUiState.Error -> {
                item {
                    Text(uiState.message)
                }
            }

            is HomeUiState.Success -> {

                val featuredPost = posts.firstOrNull()
                val remainingPosts = posts.drop(1)

                featuredPost?.let { post ->

                    item {
                        FeaturedPostCard(
                            post = post,
                            onClick = {
                                onPostClick(post.id)
                            }
                        )
                    }
                }

                item {
                    Text(
                        text = "Latest Articles",
                        style = MaterialTheme.typography.titleLarge
                    )
                }

                items(remainingPosts) { post ->

                    PostCard(
                        post = post,
                        onClick = {
                            onPostClick(post.id)
                        }
                    )
                }
            }
        }

    }

}