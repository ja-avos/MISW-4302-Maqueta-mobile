package com.misw4302.petalarms.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun TimeInput() {
    var hour by remember { mutableStateOf(9) }
    var minute by remember { mutableStateOf(15) }
    var isAM by remember { mutableStateOf(true) }

    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TimeUnitPicker(
            value = hour,
            onIncrease = { hour = if (hour == 12) 1 else hour + 1 },
            onDecrease = { hour = if (hour == 1) 12 else hour - 1 })
        Text(
            text = ":",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        TimeUnitPicker(
            value = minute,
            onIncrease = { minute = (minute + 1) % 60 },
            onDecrease = { minute = if (minute == 0) 59 else minute - 1 })
        TimeUnitPicker(
            value = if (isAM) "AM" else "PM",
            onIncrease = { isAM = !isAM },
            onDecrease = { isAM = !isAM })
    }
}

@Composable
fun TimeUnitPicker(value: Any, onIncrease: () -> Unit, onDecrease: () -> Unit) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            imageVector = Icons.Filled.KeyboardArrowUp,
            contentDescription = "Increase",
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .size(36.dp)
                .clickable { onIncrease() }
        )
        Text(
            text = value.toString().padStart(2, '0'),
            fontSize = 30.sp,
            color = MaterialTheme.colorScheme.onSurface
        )
        Icon(
            imageVector = Icons.Filled.KeyboardArrowDown,
            contentDescription = "Decrease",
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .size(36.dp)
                .clickable { onDecrease() }
        )
    }
}
