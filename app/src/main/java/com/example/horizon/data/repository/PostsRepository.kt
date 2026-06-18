package com.example.horizon.data.repository

import com.example.horizon.data.model.Post

interface PostsRepository {
    fun getPosts(): List<Post>
    fun getPost(id: String): Post?
}