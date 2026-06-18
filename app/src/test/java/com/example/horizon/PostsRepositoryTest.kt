package com.example.horizon

import com.example.horizon.data.repository.FakePostsRepository
import com.example.horizon.data.repository.PostsRepository
import junit.framework.TestCase.assertTrue
import org.junit.Before
import kotlin.test.Test
import kotlin.test.assertEquals

class PostsRepositoryTest {

    private lateinit var repository: PostsRepository

    @Before
    fun setup() {
        repository = FakePostsRepository()
    }

    @Test
    fun getPost_returnsCorrectPost() {

        val firstPost =
            repository.getPosts().first()

        val result =
            repository.getPost(firstPost.id)

        assertEquals(
            firstPost.id,
            result?.id
        )
    }

    @Test
    fun getPosts_returnsNotEmptyList() {

        assertTrue(
            repository.getPosts().isNotEmpty()
        )
    }
}