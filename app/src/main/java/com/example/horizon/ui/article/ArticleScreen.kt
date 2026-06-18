package com.example.horizon.ui.article

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.horizon.data.model.Post
import com.example.horizon.ui.theme.Dimensions

@Composable
fun ArticleScreen(
    post: Post
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(Dimensions.SpaceMedium)
            .testTag("article_screen")
    ) {

        Image(
            painter = painterResource(post.imageRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f)
                .clip(RoundedCornerShape(Dimensions.SpaceMedium))
        )

        Spacer(Modifier.height(Dimensions.SpaceMedium))

        Text(
            text = post.title,
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(Dimensions.SpaceMedium))

        Row {

            Text(
                text = post.author,
                style = MaterialTheme.typography.labelLarge
            )

            Spacer(
                modifier = Modifier.width(Dimensions.SpaceSmall)
            )

            Text(
                text = "• ${post.readTimeMinutes} min read • ${post.publishDate}",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        Spacer(modifier = Modifier.height(Dimensions.SpaceLarge))

        HorizontalDivider()

        Spacer(
            Modifier.height(Dimensions.SpaceMedium)
        )

        Text(
            text = post.content,
            style = MaterialTheme.typography.bodyLarge,
            lineHeight = 24.sp
        )
    }
}