package com.misw4302.petalarms.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun SecondaryBtn(text: String = "Secondary", onClick: () -> Unit = {}) {
    Button(
        onClick = onClick, colors = ButtonColors(
            contentColor = MaterialTheme.colorScheme.onSecondary,
            containerColor = MaterialTheme.colorScheme.secondary,
            disabledContainerColor = MaterialTheme.colorScheme.tertiary,
            disabledContentColor = MaterialTheme.colorScheme.onTertiary
        ), modifier = Modifier.shadow(
            16.dp, shape = RoundedCornerShape(16.dp)
        )

    ) {
        Text(text = text, fontSize = MaterialTheme.typography.titleLarge.fontSize)
    }

}