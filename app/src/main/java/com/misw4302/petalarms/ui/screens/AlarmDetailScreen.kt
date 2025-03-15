package com.misw4302.petalarms.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.misw4302.petalarms.ui.components.DaySelection
import com.misw4302.petalarms.ui.components.DeleteBtn
import com.misw4302.petalarms.ui.components.DropdownInput
import com.misw4302.petalarms.ui.components.EditBtn
import com.misw4302.petalarms.ui.components.GenericInput
import com.misw4302.petalarms.ui.components.InputType
import com.misw4302.petalarms.ui.components.LogoDisabled
import com.misw4302.petalarms.ui.components.PrincipalBtn
import com.misw4302.petalarms.ui.components.SecondaryBtn
import com.misw4302.petalarms.ui.components.SocialLogin
import com.misw4302.petalarms.ui.components.TimeInput

@Preview
@Composable
fun AlarmDetailScreen(navController: NavController = rememberNavController()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Alarma",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .padding(top = 36.dp, bottom = 16.dp)
                .width(200.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            modifier = Modifier
                .padding(top = 32.dp, bottom = 16.dp)
                .width(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            GenericInput(placeholder = "Medicina Tos", editable = false)
            GenericInput(placeholder = "Milo, Sasha", editable = false)
            GenericInput(placeholder = "Medicamento", editable = false)
        }
        Text(
            text = "10:30 AM",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.padding(36.dp).clickable {
                navController.navigate("alarm-display")
            }
        )
        DaySelection(enabled = false)
        Column(
            modifier = Modifier
                .padding(top = 40.dp, bottom = 16.dp)
                .width(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            SecondaryBtn(
                text = "Regresar",
                modifier = Modifier.height(44.dp),
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
                onClick = {
                    navController.popBackStack()
                }
            )
            Spacer(modifier = Modifier.height(24.dp))
            DeleteBtn(
                text = "Eliminar",
                modifier = Modifier.height(44.dp),
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
                onClick = { navController.popBackStack() }
            )
        }
    }
}