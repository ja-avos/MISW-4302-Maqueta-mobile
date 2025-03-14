package com.misw4302.petalarms.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun LogoDisabled(
    backgroundColor: Color = MaterialTheme.colorScheme.tertiary,
    iconColor: Color = MaterialTheme.colorScheme.onTertiary,
    size: Int = 120
) {
    Logo(
        backgroundColor = backgroundColor, iconColor = iconColor, size = size, shadow = false
    )

}