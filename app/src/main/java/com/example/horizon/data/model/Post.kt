package com.example.horizon.data.model

data class Post(
    val id: String,
    val title: String,
    val summary: String,
    val author: String,
    val content: String,
    val imageRes: Int,
    val category: Category,
    val readTimeMinutes: Int,
    val publishDate: String
)