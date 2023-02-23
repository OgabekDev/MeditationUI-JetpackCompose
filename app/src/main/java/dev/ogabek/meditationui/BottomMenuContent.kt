package dev.ogabek.meditationui

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class BottomMenuContent (
    var title: String,
    @DrawableRes val iconId: Int
)