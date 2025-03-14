package com.misw4302.petalarms.ui.components

import android.content.res.Resources.Theme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.misw4302.petalarms.R

@Composable
@Preview
fun Logo(
    size: Int = 120,
    backgroundColor: Color = MaterialTheme.colorScheme.secondary,
    iconColor: Color = MaterialTheme.colorScheme.onSecondary,
    shadow: Boolean = true
) {
    Box(
        modifier = Modifier
            .shadow(
                if (shadow) 16.dp else 0.dp,
                shape = CircleShape
            )
            .clip(
                shape = CircleShape
            )
            .background(color = backgroundColor)
            .padding((size * 0.2).dp)

    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.logobase),
            contentDescription = "Logo",
            modifier = Modifier.size(size.dp),
            tint = iconColor

        )
    }
}