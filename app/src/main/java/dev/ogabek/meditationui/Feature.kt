package dev.ogabek.meditationui

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature (
    var title: String,
    @DrawableRes val iconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)