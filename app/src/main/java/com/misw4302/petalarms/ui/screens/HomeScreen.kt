package com.misw4302.petalarms.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.misw4302.petalarms.R
import com.misw4302.petalarms.ui.components.LogoText
import com.misw4302.petalarms.ui.components.SectionListItem

@Preview
@Composable
fun HomeScreen(navController: NavController = rememberNavController()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 48.dp, horizontal = 66.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LogoText(logoSize = 90)
        Spacer(modifier = Modifier.height(40.dp))
        SectionListItem(
            title = "Alarmas",
            backgroundResource = R.mipmap.ic_banner_alarms_foreground,
            onClick = { navController.navigate("alarms") })
        Spacer(modifier = Modifier.height(32.dp))
        SectionListItem(
            title = "Mascotas",
            backgroundResource = R.mipmap.ic_banner_pets_foreground,
            onClick = { navController.navigate("pets") })
    }
}
