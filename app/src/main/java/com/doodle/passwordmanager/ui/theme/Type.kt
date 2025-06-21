package com.doodle.passwordmanager.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.doodle.passwordmanager.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val PlusJakartaSansFontFamily = FontFamily(
    Font(resId = R.font.plus_jakarta_sans_bold, weight = FontWeight.Bold),
    Font(resId = R.font.plus_jakarta_sans_bold_italic, style = FontStyle.Italic, weight = FontWeight.Bold),
    Font(resId = R.font.plus_jakarta_sans_extra_bold, style = FontStyle.Italic, weight = FontWeight.ExtraBold),
    Font(resId = R.font.plus_jakarta_sans_extra_bold_italic, weight = FontWeight.ExtraBold),
    Font(resId = R.font.plus_jakarta_sans_extra_light, weight = FontWeight.ExtraLight),
    Font(resId = R.font.plus_jakarta_sans_extra_light_italic, style = FontStyle.Italic, weight = FontWeight.ExtraLight),
    Font(resId = R.font.plus_jakarta_sans_italic, style = FontStyle.Italic),
    Font(resId = R.font.plus_jakarta_sans_light, weight = FontWeight.Light),
    Font(resId = R.font.plus_jakarta_sans_light_italic, style = FontStyle.Italic, weight = FontWeight.Light),
    Font(resId = R.font.plus_jakarta_sans_medium, weight = FontWeight.Medium),
    Font(resId = R.font.plus_jakarta_sans_medium_italic, style = FontStyle.Italic, weight = FontWeight.Medium),
    Font(resId = R.font.plus_jakarta_sans_regular, style = FontStyle.Normal, weight = FontWeight.Normal),
    Font(resId = R.font.plus_jakarta_sans_semi_bold, weight = FontWeight.SemiBold),
    Font(resId = R.font.plus_jakarta_sans_semi_bold_italic, style = FontStyle.Italic, weight = FontWeight.SemiBold),
)