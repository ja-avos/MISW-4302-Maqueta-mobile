package com.misw4302.petalarms.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.misw4302.petalarms.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val solwayFont = GoogleFont("Solway")

val fontFamily = FontFamily(
    Font(googleFont = solwayFont, fontProvider = provider)
)

val typographyBase = Typography()
val PetAlarmsTypography = Typography(
    displayLarge = typographyBase.displayLarge.copy(fontFamily = fontFamily),
    displayMedium = typographyBase.displayMedium.copy(fontFamily = fontFamily),
    displaySmall = typographyBase.displaySmall.copy(fontFamily = fontFamily),

    headlineLarge = typographyBase.headlineLarge.copy(fontFamily = fontFamily),
    headlineMedium = typographyBase.headlineMedium.copy(fontFamily = fontFamily),
    headlineSmall = typographyBase.headlineSmall.copy(fontFamily = fontFamily),

    titleLarge = typographyBase.titleLarge.copy(fontFamily = fontFamily),
    titleMedium = typographyBase.titleMedium.copy(fontFamily = fontFamily),
    titleSmall = typographyBase.titleSmall.copy(fontFamily = fontFamily),

    bodyLarge = typographyBase.bodyLarge.copy(fontFamily = fontFamily),
    bodyMedium = typographyBase.bodyMedium.copy(fontFamily = fontFamily),
    bodySmall = typographyBase.bodySmall.copy(fontFamily = fontFamily),

    labelLarge = typographyBase.labelLarge.copy(fontFamily = fontFamily),
    labelMedium = typographyBase.labelMedium.copy(fontFamily = fontFamily),
    labelSmall = typographyBase.labelSmall.copy(fontFamily = fontFamily),
)

// Set of Material typography styles to start with
//val Typography = Typography(
//    bodyLarge = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    )
//    /* Other default text styles to override
//    titleLarge = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 22.sp,
//        lineHeight = 28.sp,
//        letterSpacing = 0.sp
//    ),
//    labelSmall = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Medium,
//        fontSize = 11.sp,
//        lineHeight = 16.sp,
//        letterSpacing = 0.5.sp
//    )
//    */
//)