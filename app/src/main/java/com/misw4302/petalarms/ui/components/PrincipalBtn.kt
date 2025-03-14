package com.misw4302.petalarms.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

private val modifier = Modifier.shadow(
    16.dp, shape = RoundedCornerShape(16.dp)
)

@Preview
@Composable
fun PrincipalBtn(
    text: String = "Principal",
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier,
    fontSize: TextUnit = MaterialTheme.typography.titleLarge.fontSize
) {
    Button(
        onClick = onClick, colors = ButtonColors(
            contentColor = MaterialTheme.colorScheme.onPrimary,
            containerColor = MaterialTheme.colorScheme.primary,
            disabledContainerColor = MaterialTheme.colorScheme.tertiary,
            disabledContentColor = MaterialTheme.colorScheme.onTertiary
        ), modifier = modifier
            .shadow(
                16.dp, shape = RoundedCornerShape(16.dp)
            )
            .fillMaxWidth()

    ) {
        Text(
            text = text,
            fontSize = fontSize,
            modifier = Modifier.padding(vertical = 4.dp)
        )
    }

}