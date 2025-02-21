//
//  TransactionsListScreenView.swift
//  iosApp
//
//  Created by Wilmer Hurtado on 17/12/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import Shared
import SharedUI

struct TransactionsListScreenView: View {
    
    @StateObject
    private var viewModel = TransactionsListViewModel()
    
    var body: some View {
        NavigationTemplateView {
            List {
                ForEach(1..<20) { index in
                    Text("Elemento \(index)")
                }
            }
        }
        .navigationTitle("Transactions")
        .task {
            await viewModel.fetchTransactions()
        }
    }
}

class TransactionsListViewModel: ObservableObject {
    private let delegate: TransactionsListViewModelDelegate = TransactionsListViewModelDelegate()
    
    @Published var state: TransactionsListContract.State?
    
    @MainActor
    func fetchTransactions() async {
        for await state in delegate.state {
            self.state = state
            print(state)
        }
    }
}

#Preview {
    TransactionsListScreenView()
}
