package com.misw4302.petalarms.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.misw4302.petalarms.ui.components.LogoText
import com.misw4302.petalarms.ui.components.PrincipalBtn
import com.misw4302.petalarms.ui.components.SecondaryBtn

@Preview
@Composable
fun StartScreen(navController: NavController = rememberNavController()) {
    Column(
        modifier = Modifier.width(240.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        LogoText(
            modifier = Modifier.padding(vertical = 60.dp), logoSize = 100
        )
        PrincipalBtn(text = "Ingresar", onClick = {
            navController.navigate("login")
        })
        Spacer(modifier = Modifier.height(16.dp))
        SecondaryBtn(text = "Registrarme", onClick = {
            navController.navigate("signup")
        })
    }
}