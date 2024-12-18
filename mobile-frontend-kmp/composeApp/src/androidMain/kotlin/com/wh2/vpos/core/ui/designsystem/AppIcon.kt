package com.wh2.vpos.core.ui.designsystem

import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

// TODO: Move to module :code:designsystem

object AppIcons {
    object Filled {
        val Home = Icons.Filled.Home
        val Categories = Icons.Filled.Category
        val Budget = Icons.Filled.Mail
        val Transactions = Icons.Filled.AttachMoney
        val Accounts = Icons.Filled.AccountBalance
        val ToggleNavigationDrawer = Icons.Filled.Menu
        val BackNavigation = Icons.AutoMirrored.Filled.ArrowBack
        val AddNewItem = Icons.Filled.Add
    }

    object Outlined {
        val Home = Icons.Outlined.Home
        val Budget = Icons.Outlined.Mail
        val Categories = Icons.Outlined.Category
        val Transfers = Icons.Outlined.AttachMoney
        val Accounts = Icons.Outlined.AccountBalance
        val ToggleNavigationDrawer = Icons.Outlined.Menu
        val BackNavigation = Icons.AutoMirrored.Outlined.ArrowBack
        val AddNewItem = Icons.Outlined.Add
    }
}

sealed class AppIcon

data class DrawableResourceIcon(@DrawableRes val id: Int) : AppIcon()

data class ImageVectorIcon(val imageVector: ImageVector) : AppIcon()

/**
 * Factory that creates a custom [Icon] composable based on a subtype of this [AppIcon] instance.
 */
@Composable
fun AppIcon.CreateIcon(contentDescription: String, colorTint: Color = LocalContentColor.current) {
    when (this) {
        is DrawableResourceIcon -> {
            Icon(
                painter = painterResource(id = id),
                tint = colorTint,
                contentDescription = contentDescription
            )
        }

        is ImageVectorIcon -> {
            Icon(
                imageVector = imageVector,
                tint = colorTint,
                contentDescription = contentDescription
            )
        }
    }
}