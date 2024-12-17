import SwiftUI

struct ContentView: View {
    @State private var showAddTransactionSheet: Bool = false
    @State private var showCategoriesSheet: Bool = false
    
    var body: some View {
        HomeScreen()
//        NavigationTemplateView {
//            VStack {
//                Button(action: {
//                    showAddTransactionSheet = true
//                }, label: {
//                    Text("Add Transaction")
//                })
//                Button(action: {
//                    showCategoriesSheet = true
//                }, label: {
//                    Text("Categories")
//                })
//            }
//        }
//        .navigationTitle(Text("Transactions"))
//        .sheet(isPresented: $showAddTransactionSheet, content: {
//            AddTransactionScreenView()
//        })
//        .sheet(isPresented: $showCategoriesSheet, content: {
//            ChooseCategoryScreenView()
//        })
    }
}

#Preview {
    ContentView()
}
