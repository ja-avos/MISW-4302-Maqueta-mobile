package com.misw4302.petalarms.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun DaySelection(enabled: Boolean = true) {
    val days = listOf("L", "M", "I", "J", "V", "S", "D")
    val selectedDays = remember { mutableStateListOf("L", "V") }

    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        days.forEach { day ->
            val isSelected = day in selectedDays
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .shadow(
                        if (isSelected) 16.dp else 0.dp,
                        CircleShape
                    )
                    .clip(CircleShape)
                    .background(color =
                    if (isSelected) MaterialTheme.colorScheme.background else Color.Transparent)
                    .border(
                        if (isSelected) 2.dp else 0.dp,
                        if (isSelected) MaterialTheme.colorScheme.primary else Color.Transparent,
                        CircleShape
                    )
                    .clickable {
                        if (!enabled) return@clickable
                        if (isSelected) selectedDays.remove(day)
                        else selectedDays.add(day)
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = day,
                    fontSize = 22.sp,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}
