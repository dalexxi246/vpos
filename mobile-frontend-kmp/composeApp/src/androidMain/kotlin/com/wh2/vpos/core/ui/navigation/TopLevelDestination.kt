package com.wh2.vpos.core.ui.navigation

import androidx.annotation.StringRes
import com.wh2.vpos.R
import com.wh2.vpos.core.ui.designsystem.AppIcon
import com.wh2.vpos.core.ui.designsystem.AppIcons
import com.wh2.vpos.core.ui.designsystem.ImageVectorIcon

sealed class TopLevelDestination(
    override val route: String,
    val selectedIcon: AppIcon,
    val unselectedIcon: AppIcon,
    @StringRes val iconTextId: Int
) : Destination(route) {

    data object Categories :
        TopLevelDestination(
            route = "categories",
            selectedIcon = ImageVectorIcon(AppIcons.Filled.Categories),
            unselectedIcon = ImageVectorIcon(AppIcons.Outlined.Categories),
            iconTextId = R.string.screen_title_categories
        )

    data object Transaction : TopLevelDestination(
        route = "transactions",
        selectedIcon = ImageVectorIcon(AppIcons.Filled.Transactions),
        unselectedIcon = ImageVectorIcon(AppIcons.Outlined.Transfers),
        iconTextId = R.string.screen_title_transaction
    )

    data object Accounts : TopLevelDestination(
        route = "accounts",
        selectedIcon = ImageVectorIcon(AppIcons.Filled.Accounts),
        unselectedIcon = ImageVectorIcon(AppIcons.Outlined.Accounts),
        iconTextId = R.string.screen_title_accounts
    )

    data object Budget : TopLevelDestination(
        route = "budget",
        selectedIcon = ImageVectorIcon(AppIcons.Filled.Budget),
        unselectedIcon = ImageVectorIcon(AppIcons.Outlined.Budget),
        iconTextId = R.string.screen_title_budget
    )
}