package com.example.horizon.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.horizon.data.repository.PostsRepository
import com.example.horizon.ui.article.ArticleRoute
import com.example.horizon.ui.article.ArticleViewModel
import com.example.horizon.ui.home.HomeRoute
import com.example.horizon.ui.home.HomeViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.horizon.ui.home.HomeArticleRoute
import androidx.navigation.compose.currentBackStackEntryAsState

const val HOME_ROUTE = "home"
const val ARTICLE_ROUTE = "article"

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun HorizonNavigation(
    repository: PostsRepository,
    widthSizeClass:  WindowWidthSizeClass
) {
    val navController = rememberNavController()

    val currentBackStackEntry by
    navController.currentBackStackEntryAsState()

    val isExpanded =
        widthSizeClass == WindowWidthSizeClass.Expanded

    LaunchedEffect(isExpanded) {

        if (
            isExpanded &&
            currentBackStackEntry?.destination?.route?.startsWith(ARTICLE_ROUTE) == true
        ) {
            navController.navigate(HOME_ROUTE) {
                popUpTo(HOME_ROUTE) {
                    inclusive = false
                }
                launchSingleTop = true
            }
        }
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        NavHost(
            navController = navController,
            startDestination = HOME_ROUTE
        ) {
            composable(HOME_ROUTE) { backStackEntry ->

                val viewModel: HomeViewModel = viewModel(
                    viewModelStoreOwner = backStackEntry,
                    factory = HomeViewModel.Factory
                )

                if (isExpanded) {

                    HomeArticleRoute(
                        viewModel = viewModel,
                        repository = repository
                    )

                } else {

                    HomeRoute(
                        viewModel = viewModel,
                        onPostClick = { postId ->
                            navController.navigate("$ARTICLE_ROUTE/$postId") {
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }

            composable(
                route = "$ARTICLE_ROUTE/{postId}"
            ) { backStackEntry ->

                val viewModel: ArticleViewModel = viewModel(
                    viewModelStoreOwner = backStackEntry,
                    factory = ArticleViewModel.Factory
                )

                ArticleRoute(
                    viewModel = viewModel
                )
            }
        }
    }
}