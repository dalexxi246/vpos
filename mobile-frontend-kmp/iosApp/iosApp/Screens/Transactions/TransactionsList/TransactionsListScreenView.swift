//
//  TransactionsListScreenView.swift
//  iosApp
//
//  Created by Wilmer Hurtado on 17/12/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct TransactionsListScreenView: View {
    var body: some View {
        NavigationTemplateView {
            Text("Transactions")
                .padding()
        }
        .navigationTitle("Transactions")
    }
}

#Preview {
    TransactionsListScreenView()
}
