package com.example.horizon.data

import com.example.horizon.data.repository.FakePostsRepository
import com.example.horizon.data.repository.PostsRepository

interface AppContainer {
    val postsRepository: PostsRepository
}

class DefaultAppContainer : AppContainer {

    override val postsRepository: PostsRepository =
        FakePostsRepository()
}