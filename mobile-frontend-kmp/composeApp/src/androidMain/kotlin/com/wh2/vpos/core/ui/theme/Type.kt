//package com.wh2.budgetapp.ui.theme
//
//import androidx.compose.material3.Text
//import androidx.compose.material3.Typography
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.Font
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.tooling.preview.PreviewParameter
//import androidx.compose.ui.unit.sp
//import com.wh2.budgetapp.ui.R
//import com.wh2.budgetapp.ui.previewparameters.TextStylesPreviewParameterProvider
//
//val sourceSans3Family = FontFamily(
//    Font(R.font.source_sans_3_black, FontWeight.Black),
//    Font(R.font.source_sans_3_black_italic, FontWeight.Black, FontStyle.Italic),
//    Font(R.font.source_sans_3_bold, FontWeight.Bold),
//    Font(R.font.source_sans_3_bold_italic, FontWeight.Bold, FontStyle.Italic),
//    Font(R.font.source_sans_3_extra_bold, FontWeight.ExtraBold),
//    Font(R.font.source_sans_3_extra_bold_italic, FontWeight.ExtraBold, FontStyle.Italic),
//    Font(R.font.source_sans_3_extra_light, FontWeight.ExtraLight),
//    Font(R.font.source_sans_3_extra_light_italic, FontWeight.ExtraLight, FontStyle.Italic),
//    Font(R.font.source_sans_3_italic, FontWeight.Normal, FontStyle.Italic),
//    Font(R.font.source_sans_3_light, FontWeight.Light),
//    Font(R.font.source_sans_3_light_italic, FontWeight.Light, FontStyle.Italic),
//    Font(R.font.source_sans_3_medium, FontWeight.Medium),
//    Font(R.font.source_sans_3_medium_italic, FontWeight.Medium, FontStyle.Italic),
//    Font(R.font.source_sans_3_regular, FontWeight.Normal),
//    Font(R.font.source_sans_3_semi_bold, FontWeight.SemiBold),
//    Font(R.font.source_sans_3_semi_bold_italic, FontWeight.SemiBold, FontStyle.Italic),
//)
//
//// Set of Material typography styles to start with
//val Typography = Typography(
//    displayLarge = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 57.sp,
//        lineHeight = 64.sp,
//        letterSpacing = (-0.25).sp
//    ),
//    displayMedium = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 45.sp,
//        lineHeight = 52.sp,
//        letterSpacing = 0.sp
//    ),
//    displaySmall = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 36.sp,
//        lineHeight = 44.sp,
//        letterSpacing = 0.sp
//    ),
//    headlineLarge = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 32.sp,
//        lineHeight = 40.sp,
//        letterSpacing = 0.sp
//    ),
//    headlineMedium = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 28.sp,
//        lineHeight = 36.sp,
//        letterSpacing = 0.sp
//    ),
//    headlineSmall = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 24.sp,
//        lineHeight = 32.sp,
//        letterSpacing = 0.sp
//    ),
//    titleLarge = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 22.sp,
//        lineHeight = 28.sp,
//        letterSpacing = 0.sp
//    ),
//    titleMedium = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.15.sp
//    ),
//    titleSmall = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 14.sp,
//        lineHeight = 20.sp,
//        letterSpacing = 0.1.sp
//    ),
//    labelLarge = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 14.sp,
//        lineHeight = 20.sp,
//        letterSpacing = 0.1.sp
//    ),
//    labelMedium = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Medium,
//        fontSize = 12.sp,
//        lineHeight = 16.sp,
//        letterSpacing = 0.5.sp
//    ),
//    labelSmall = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 11.sp,
//        lineHeight = 16.sp,
//        letterSpacing = 0.5.sp
//    ),
//    bodyLarge = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    ),
//    bodyMedium = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 14.sp,
//        lineHeight = 20.sp,
//        letterSpacing = 0.25.sp
//    ),
//    bodySmall = TextStyle(
//        fontFamily = sourceSans3Family,
//        fontWeight = FontWeight.Normal,
//        fontSize = 12.sp,
//        lineHeight = 16.sp,
//        letterSpacing = 0.4.sp
//    ),
//)
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewDynamic(
//    @PreviewParameter(TextStylesPreviewParameterProvider::class) textStyle: TextStyle
//) {
//    Text(text = "Hola pobres!", style = textStyle)
//}
