package com.doodle.passwordmanager.util

import androidx.window.core.layout.WindowSizeClass
import androidx.window.core.layout.WindowWidthSizeClass

enum class DeviceConfiguration {
    MOBILE_PORTRAIT,
    MOBILE_LANDSCAPE,
    TABLET_PORTRAIT,
    TABLET_LANDSCAPE,
    UNFOLDED_PORTRAIT,
    UNFOLDED_LANDSCAPE,
    DESKTOP;

    companion object {
        fun fromWindowSizeClass(windowSizeClass: WindowSizeClass): DeviceConfiguration {
            val widthSizeClass = windowSizeClass.windowWidthSizeClass;
            val heightSizeClass = windowSizeClass.windowHeightSizeClass;

            return when {
                widthSizeClass == WindowWidthSizeClass.COMPACT && heightSizeClass == WindowWidthSizeClass.MEDIUM -> MOBILE_PORTRAIT;
                widthSizeClass == WindowWidthSizeClass.COMPACT && heightSizeClass == WindowWidthSizeClass.EXPANDED -> MOBILE_PORTRAIT;
                heightSizeClass == WindowWidthSizeClass.COMPACT -> MOBILE_LANDSCAPE;
                widthSizeClass == WindowWidthSizeClass.MEDIUM && heightSizeClass == WindowWidthSizeClass.EXPANDED -> TABLET_PORTRAIT;
                widthSizeClass == WindowWidthSizeClass.EXPANDED && heightSizeClass == WindowWidthSizeClass.MEDIUM -> TABLET_LANDSCAPE;
                widthSizeClass == WindowWidthSizeClass.MEDIUM -> UNFOLDED_PORTRAIT;
                widthSizeClass == WindowWidthSizeClass.EXPANDED -> UNFOLDED_LANDSCAPE;
                else -> DESKTOP;
            }
        }
    }
}