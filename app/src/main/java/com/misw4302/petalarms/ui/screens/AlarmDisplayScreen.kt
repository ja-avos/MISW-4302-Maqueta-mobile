package com.misw4302.petalarms.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.misw4302.petalarms.R
import com.misw4302.petalarms.ui.components.DeleteBtn
import com.misw4302.petalarms.ui.components.LogoText
import com.misw4302.petalarms.ui.components.PrincipalBtn
import com.misw4302.petalarms.ui.components.SecondaryBtn
import com.misw4302.petalarms.ui.components.SectionListItem

@Preview
@Composable
fun AlarmDisplayScreen(navController: NavController = rememberNavController()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 48.dp, horizontal = 66.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        LogoText(logoSize = 90)
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            "Alarma",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.ExtraBold,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            "Medicina Tos",
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            "Lunes, 10:30 AM",
            fontSize = MaterialTheme.typography.titleMedium.fontSize,
            color = MaterialTheme.colorScheme.onSurface
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            PetPictureSmall(
                name = "Sasha",
                imageUrl = "https://www.hartz.com/wp-content/uploads/2022/04/small-dog-owners-1.jpg"
            )
            PetPictureSmall(
                name = "Milo",
                imageUrl = "https://hips.hearstapps.com/hmg-prod/images/portrait-of-a-bichon-frise-dog-royalty-free-image-1682312789.jpg"
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        AlarmActions(
            onAccept = { navController.popBackStack() },
            onPostpone = { navController.popBackStack() },
            onCancel = { navController.popBackStack() }
        )

    }
}

@Composable
fun PetPictureSmall(
    name: String,
    imageUrl: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Image(
            painter = rememberAsyncImagePainter(imageUrl),
            contentDescription = "Pet Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = name,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

@Composable
fun AlarmActions(
    onAccept: () -> Unit = {},
    onPostpone: () -> Unit = {},
    onCancel: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        PrincipalBtn(
            text = "Aceptar",
            onClick = onAccept,
            fontSize = MaterialTheme.typography.titleMedium.fontSize
        )
        SecondaryBtn(
            text = "Posponer 10 min",
            onClick = onPostpone,
            fontSize = MaterialTheme.typography.titleMedium.fontSize
        )
        DeleteBtn(
            text = "Cancelar",
            onClick = onCancel,
            fontSize = MaterialTheme.typography.titleMedium.fontSize
        )
    }
}