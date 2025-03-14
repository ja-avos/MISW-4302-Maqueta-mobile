package com.misw4302.petalarms

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.Days
import com.misw4302.petalarms.ui.components.AlarmListItem
import com.misw4302.petalarms.ui.components.BackBtn
import com.misw4302.petalarms.ui.components.DaySelection
import com.misw4302.petalarms.ui.components.DeleteBtn
import com.misw4302.petalarms.ui.components.DropdownInput
import com.misw4302.petalarms.ui.components.EditBtn
import com.misw4302.petalarms.ui.components.GenericInput
import com.misw4302.petalarms.ui.components.Logo
import com.misw4302.petalarms.ui.components.LogoDisabled
import com.misw4302.petalarms.ui.components.LogoText
import com.misw4302.petalarms.ui.components.PetListItem
import com.misw4302.petalarms.ui.components.PrincipalBtn
import com.misw4302.petalarms.ui.components.ScreenTitle
import com.misw4302.petalarms.ui.components.SecondaryBtn
import com.misw4302.petalarms.ui.components.SectionListItem
import com.misw4302.petalarms.ui.components.TimeInput
import com.misw4302.petalarms.ui.theme.PetAlarmsTheme
import java.security.Principal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PetAlarmsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
                    PetAlarms(modifier = Modifier.padding(padding))
                }
            }
        }
    }
}

@Composable
fun PetAlarms(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ScreenTitle()
    }
}

@Preview(showBackground = true)
@Composable
fun PetAlarmsPreview() {
    PetAlarmsTheme {
        PetAlarms()
    }
}