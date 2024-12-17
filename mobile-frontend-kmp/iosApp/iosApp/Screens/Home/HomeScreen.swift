//
//  HomeScreen.swift
//  iosApp
//
//  Created by Wilmer Hurtado on 30/11/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct HomeScreen: View {
//    var body: some View {
//        Text("Hello, World!")
//    }
    var body: some View {
        TabView {
            TransactionsListScreenView()
                .tabItem {
                    Label("Transactions", systemImage: "text.badge.plus")
                }
            Text("Accounts manager")
                .tabItem {
                    Label("Accounts", systemImage: "building.columns.circle.fill")
                }
            Text("Categories manager")
                .tabItem {
                    Label("Categories", systemImage: "folder")
                }
            Text("Budgets manager")
                .tabItem {
                    Label("Budgets", systemImage: "envelope")
                }
        }
        .translucentBackground()
    }
}

#Preview {
    HomeScreen()
}
