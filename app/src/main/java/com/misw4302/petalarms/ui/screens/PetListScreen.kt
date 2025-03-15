package com.misw4302.petalarms.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.misw4302.petalarms.R
import com.misw4302.petalarms.ui.components.LogoText
import com.misw4302.petalarms.ui.components.PetListItem
import com.misw4302.petalarms.ui.components.PrincipalBtn
import com.misw4302.petalarms.ui.components.ScreenTitle
import com.misw4302.petalarms.ui.components.SectionListItem

@Preview
@Composable
fun PetListScreen(navController: NavController = rememberNavController()) {

    val pets = listOf(
        "Sasha", "Milo", "Max"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 48.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ScreenTitle(title = "Mascotas", onBack = { navController.popBackStack() })
        Spacer(modifier = Modifier.height(40.dp))
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 24.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            pets.forEach { pet ->
                PetListItem(
                    name = pet,
                    onClick = { navController.navigate("pet-detail") }
                )
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        PrincipalBtn(
            text = "Agregar mascota",
            modifier = Modifier.padding(horizontal = 40.dp),
            onClick = { navController.navigate("pet-create") }
        )
    }
}