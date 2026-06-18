package com.example.horizon.ui.components

import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.horizon.data.model.Post
import androidx.compose.material3.Card
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.horizon.ui.theme.Dimensions

@Composable
fun FeaturedPostCard(
    post: Post,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(Dimensions.SpaceMedium),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column {

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

            Column(
                modifier = Modifier.padding(Dimensions.SpaceMedium)
            ) {
                Text(
                    text = post.title,
                    style = MaterialTheme.typography.titleLarge
                )

                Spacer(
                    modifier = Modifier.height(Dimensions.SpaceSmall)
                )

                Text(
                    text = post.summary,
                    style = MaterialTheme.typography.bodyMedium,
                    minLines = 2,
                    maxLines = 3
                )
                
                Spacer(
                    modifier = Modifier.height(Dimensions.SpaceSmall)
                )

                Text(
                    text = "${post.readTimeMinutes} min read • ${post.publishDate}",
                    style = MaterialTheme.typography.labelSmall
                )
            }
        }
    }
}