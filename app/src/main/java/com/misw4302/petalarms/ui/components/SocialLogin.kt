package com.misw4302.petalarms.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.misw4302.petalarms.R

@Preview
@Composable
fun SocialLogin(onClick : () -> Unit = {}, iconSize: Int = 48) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /* Handle Facebook Click */ }) {
            Icon(
                painter = painterResource(id = R.drawable.facebook), // Replace with your icon
                contentDescription = "Facebook",
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(iconSize.dp)
            )
        }

        IconButton(onClick = { /* Handle Google Click */ }) {
            Icon(
                painter = painterResource(id = R.drawable.google), // Replace with your icon
                contentDescription = "Google",
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(iconSize.dp)
            )
        }

        IconButton(onClick = { /* Handle LinkedIn Click */ }) {
            Icon(
                painter = painterResource(id = R.drawable.linkedin), // Replace with your icon
                contentDescription = "LinkedIn",
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(iconSize.dp)
            )
        }
    }
}