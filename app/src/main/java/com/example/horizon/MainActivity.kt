package com.example.horizon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import com.example.horizon.ui.theme.HorizonTheme
import com.example.horizon.ui.HorizonApp
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            val appContainer = (application as HorizonApplication).container
            val widthSizeClass =
                calculateWindowSizeClass(this).widthSizeClass

            HorizonTheme {
                HorizonApp(
                    repository = appContainer.postsRepository,
                    widthSizeClass = widthSizeClass
                )
            }

        }
    }
}