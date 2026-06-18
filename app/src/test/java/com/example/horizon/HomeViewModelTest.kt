package com.example.horizon

import com.example.horizon.data.model.Category
import com.example.horizon.data.repository.FakePostsRepository
import com.example.horizon.data.repository.PostsRepository
import com.example.horizon.ui.home.HomeUiState
import com.example.horizon.ui.home.HomeViewModel
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest

@OptIn(ExperimentalCoroutinesApi::class)
class HomeViewModelTest {

    private lateinit var repository: PostsRepository

    private lateinit var viewModel: HomeViewModel

    @Before
    fun setup() {

        repository = FakePostsRepository()

        viewModel = HomeViewModel(repository)
    }

    @Test
    fun allCategory_returnsAllPosts() = runTest {

        val uiState = viewModel.uiState.value as HomeUiState.Success

        assertEquals(
            repository.getPosts().size,
            uiState.posts.size
        )
    }

    @Test
    fun scienceCategory_returnsOnlySciencePosts() = runTest {

        viewModel.onCategorySelected(Category.SCIENCE)

        val posts = viewModel.filteredPosts.value

        assertTrue(
            posts.all {
                it.category == Category.SCIENCE
            }
        )
    }

    @Test
    fun historyCategory_returnsOnlyHistoryPosts() = runTest {

        viewModel.onCategorySelected(Category.HISTORY)

        val posts = viewModel.filteredPosts.value

        assertTrue(
            posts.all {
                it.category == Category.HISTORY
            }
        )
    }
}