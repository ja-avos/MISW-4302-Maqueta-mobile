package com.misw4302.petalarms.ui.screens

import androidx.compose.foundation.Image
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
import com.misw4302.petalarms.ui.components.EditBtn
import com.misw4302.petalarms.ui.components.GenericInput
import com.misw4302.petalarms.ui.components.InputType
import com.misw4302.petalarms.ui.components.LogoDisabled
import com.misw4302.petalarms.ui.components.PrincipalBtn
import com.misw4302.petalarms.ui.components.SecondaryBtn
import com.misw4302.petalarms.ui.components.SocialLogin

@Preview
@Composable
fun PetCreateScreen(navController: NavController = rememberNavController()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Nueva mascota",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .padding(top = 36.dp, bottom = 16.dp)
                .width(200.dp)
        )
        PetPicture()
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            GenericInput(placeholder = "Nombre")
            GenericInput(placeholder = "Raza")
            GenericInput(placeholder = "Sexo")
            GenericInput(placeholder = "Peso (gr)")
            GenericInput(placeholder = "Altura (cm)")
        }
        Column(
            modifier = Modifier
                .padding(16.dp)
                .width(200.dp),
        ) {
            PrincipalBtn(
                text = "Agregar mascota",
                modifier = Modifier.height(44.dp),
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
                onClick = {
                    navController.popBackStack()
                    navController.navigate("pet-detail")
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            SecondaryBtn(
                text = "Regresar",
                modifier = Modifier.height(44.dp),
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
                onClick = { navController.popBackStack() }
            )
        }
    }
}

@Composable
fun PetPicture() {

    val petPicture: MutableState<String> = remember { mutableStateOf("") }

    Box(
        contentAlignment = Alignment.BottomEnd,
    ) {
        Box(modifier = Modifier.padding(12.dp)) {
            if (petPicture.value.isNotEmpty()) {
                Image(
                    painter = rememberAsyncImagePainter(petPicture.value),
                    contentDescription = "Pet Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(96.dp)
                        .clip(CircleShape)
                )
            } else {
                LogoDisabled(size = 80)
            }
        }
        EditBtn(
            onCLick = {
                if (petPicture.value.isEmpty()) {
                    petPicture.value =
                        "https://www.hartz.com/wp-content/uploads/2022/04/small-dog-owners-1.jpg"
                } else {
                    petPicture.value = ""
                }
            }
        )
    }
}