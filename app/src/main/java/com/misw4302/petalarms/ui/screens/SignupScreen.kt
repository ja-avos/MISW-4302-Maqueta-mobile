package com.misw4302.petalarms.ui.screens

import android.widget.Space
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.misw4302.petalarms.ui.components.GenericInput
import com.misw4302.petalarms.ui.components.InputType
import com.misw4302.petalarms.ui.components.PrincipalBtn
import com.misw4302.petalarms.ui.components.SecondaryBtn
import com.misw4302.petalarms.ui.components.SocialLogin
import java.security.Principal

@Preview
@Composable
fun SignupScreen(navController: NavController = rememberNavController()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Registro",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.ExtraBold,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(top = 36.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        SocialLogin(iconSize = 32)
        HorizontalDivider(modifier = Modifier.padding(vertical = 20.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.weight(1f)
        ) {
            GenericInput(placeholder = "Nombres")
            GenericInput(placeholder = "Apellidos")
            GenericInput(placeholder = "Usuario")
            GenericInput(placeholder = "Correo")
            GenericInput(placeholder = "Ciudad")
            GenericInput(placeholder = "Contraseña", type = InputType.PASSWORD)
            GenericInput(placeholder = "Confirmar Contraseña", type = InputType.PASSWORD)
        }
        Column(
            modifier = Modifier
                .padding(16.dp)
                .width(200.dp),
        ) {
            PrincipalBtn(
                text = "Registrar",
                modifier = Modifier.height(44.dp),
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
                onClick = { navController.navigate("login") }
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