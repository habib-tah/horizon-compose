package com.example.horizon.ui.home

import com.example.horizon.data.model.Category

sealed class CategoryFilterState {
    data object All : CategoryFilterState()
    data class Selected(val category: Category) : CategoryFilterState()
}