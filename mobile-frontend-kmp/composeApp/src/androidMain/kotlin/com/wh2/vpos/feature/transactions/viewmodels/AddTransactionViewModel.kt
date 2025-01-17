package com.wh2.vpos.feature.transactions.viewmodels

import androidx.lifecycle.ViewModel
import com.wh2.vpos.viewmodels.AddTransactionViewModelDelegate
import com.wh2.vpos.views.AddTransactionContract

class AddTransactionViewModel: ViewModel(), AddTransactionContract.ViewModel by AddTransactionViewModelDelegate()