package com.wh2.vpos.feature.transactions.navigation.routes

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.wh2.vpos.feature.transactions.viewmodels.AddTransactionViewModel
import kotlinx.serialization.Serializable
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun AddTransactionRoute() {
    val viewModel = koinViewModel<AddTransactionViewModel>()
    Text("Add Transaction")
}

@Serializable
object AddTransactionDestinationParams