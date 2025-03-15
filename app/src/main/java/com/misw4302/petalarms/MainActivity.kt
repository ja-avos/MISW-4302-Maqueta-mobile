package com.misw4302.petalarms

import android.annotation.SuppressLint
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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
import com.misw4302.petalarms.ui.screens.AlarmCreateScreen
import com.misw4302.petalarms.ui.screens.AlarmDetailScreen
import com.misw4302.petalarms.ui.screens.AlarmDisplayScreen
import com.misw4302.petalarms.ui.screens.AlarmsListScreen
import com.misw4302.petalarms.ui.screens.HomeScreen
import com.misw4302.petalarms.ui.screens.LoginScreen
import com.misw4302.petalarms.ui.screens.PetCreateScreen
import com.misw4302.petalarms.ui.screens.PetDetailScreen
import com.misw4302.petalarms.ui.screens.PetListScreen
import com.misw4302.petalarms.ui.screens.SignupScreen
import com.misw4302.petalarms.ui.screens.StartScreen
import com.misw4302.petalarms.ui.theme.PetAlarmsTheme
import java.security.Principal

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PetAlarmsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    PetAlarms(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun PetAlarms(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        NavHost(
            navController = navController, startDestination = "start", modifier = modifier
        ) {
            composable("start") { StartScreen(navController) }
            composable("login") { LoginScreen(navController) }
            composable("signup") { SignupScreen(navController) }
            composable("home") { HomeScreen(navController) }
            composable("pets") { PetListScreen(navController) }
            composable("alarms") { AlarmsListScreen(navController) }
            composable("pet-detail") { PetDetailScreen(navController) }
            composable("alarm-detail") { AlarmDetailScreen(navController) }
            composable("pet-create") { PetCreateScreen(navController) }
            composable("alarm-create") { AlarmCreateScreen(navController) }
            composable("alarm-display") { AlarmDisplayScreen(navController) }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PetAlarmsPreview() {
    PetAlarmsTheme {
        PetAlarms()
    }
}