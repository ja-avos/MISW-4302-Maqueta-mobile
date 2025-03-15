package com.misw4302.petalarms.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun DeleteBtn(
    text: String = "Delete",
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    fontSize: TextUnit = MaterialTheme.typography.titleLarge.fontSize
) {
    TextButton(
        onClick = onClick,
        colors = ButtonColors(
            contentColor = MaterialTheme.colorScheme.error,
            containerColor = Color.Transparent,
            disabledContainerColor = MaterialTheme.colorScheme.tertiary,
            disabledContentColor = MaterialTheme.colorScheme.onTertiary
        )
    ) {
        Text(text = text, fontSize = fontSize)
    }

}