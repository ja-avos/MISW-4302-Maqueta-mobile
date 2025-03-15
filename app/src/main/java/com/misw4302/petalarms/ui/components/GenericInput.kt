package com.misw4302.petalarms.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class InputType {
    TEXT, NUMBER, PASSWORD
}

@Preview
@Composable
fun GenericInput(placeholder: String = "Placeholder", type: InputType = InputType.TEXT, editable: Boolean = true) {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        readOnly = !editable,
        onValueChange = { text = it },
        singleLine = true,
        placeholder = {
            Text(
                placeholder,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface,
                lineHeight = 12.sp
            )
        },
        textStyle = TextStyle(
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.onSurface,
            fontWeight = FontWeight.Bold,
            lineHeight = 12.sp,
            fontFamily = MaterialTheme.typography.bodyLarge.fontFamily
        ),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color(0xFFFFF7F2),
            unfocusedContainerColor = Color(0xFFFFF7F2),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        visualTransformation = if (type == InputType.PASSWORD) {
            androidx.compose.ui.text.input.PasswordVisualTransformation()
        } else {
            androidx.compose.ui.text.input.VisualTransformation.None
        },
        shape = RoundedCornerShape(30.dp),
        modifier = Modifier
            .height(48.dp).padding(0.dp)
            .border(1.dp, MaterialTheme.colorScheme.primary, RoundedCornerShape(32.dp))

    )
}
