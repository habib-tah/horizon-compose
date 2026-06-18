package com.example.horizon.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.horizon.data.model.Post
import com.example.horizon.ui.theme.Dimensions

@Composable
fun PostCard(
    post: Post,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(post.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center,
                modifier = Modifier
                    .width(160.dp)
                    .height(120.dp)
                    .clip(RoundedCornerShape(Dimensions.SpaceMedium))
            )

            Spacer(modifier = Modifier.width(Dimensions.SpaceMedium))

            Column {

                Text(
                    text = post.title,
                    style =MaterialTheme.typography.titleSmall,
                    modifier = modifier
                        .padding(end = Dimensions.SpaceMedium)
                )

                Spacer(
                    modifier = Modifier.height(Dimensions.SpaceSmall)
                )

                Text(
                    text = "By: ${post.author}",
                    style = MaterialTheme.typography.labelSmall
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