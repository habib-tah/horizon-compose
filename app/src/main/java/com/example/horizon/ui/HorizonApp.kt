package com.example.horizon.ui

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import com.example.horizon.data.repository.PostsRepository
import com.example.horizon.navigation.HorizonNavigation

@Composable
fun HorizonApp(
    repository: PostsRepository,
    widthSizeClass: WindowWidthSizeClass
) {

    HorizonNavigation(
        repository = repository,
        widthSizeClass = widthSizeClass
    )
}