package com.wh2.vpos.feature.transactions.viewmodels

import androidx.lifecycle.ViewModel
import com.wh2.vpos.shared.ui.viewmodels.AddTransactionViewModelDelegate
import com.wh2.vpos.shared.ui.views.AddTransactionContract

class AddTransactionViewModel: ViewModel(), AddTransactionContract.ViewModel by AddTransactionViewModelDelegate()