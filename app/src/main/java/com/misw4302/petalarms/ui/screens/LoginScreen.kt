package com.misw4302.petalarms.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.misw4302.petalarms.ui.components.GenericInput
import com.misw4302.petalarms.ui.components.InputType
import com.misw4302.petalarms.ui.components.PrincipalBtn
import com.misw4302.petalarms.ui.components.SecondaryBtn
import com.misw4302.petalarms.ui.components.SocialLogin

@Preview
@Composable
fun LoginScreen(navController: NavController = rememberNavController()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Inicio de sesión",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(vertical = 36.dp).width(200.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            GenericInput(placeholder = "Usuario")
            GenericInput(placeholder = "Contraseña", type = InputType.PASSWORD)
        }
        HorizontalDivider(modifier = Modifier.padding(36.dp))
        SocialLogin(iconSize = 32)
        Column(
            modifier = Modifier
                .padding(16.dp)
                .width(200.dp),
        ) {
            PrincipalBtn(
                text = "Ingresar",
                modifier = Modifier.height(44.dp),
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
                onClick = { navController.navigate("home") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            SecondaryBtn(
                text = "Regresar",
                modifier = Modifier.height(44.dp),
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
                onClick = { navController.navigate("start") }
            )
        }
    }
}