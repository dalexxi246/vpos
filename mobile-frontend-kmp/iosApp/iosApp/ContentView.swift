import SwiftUI

struct ContentView: View {
    var body: some View {
        NavigationTemplateView {
            NavigationLink {
                AddTransactionScreenView()
            } label: {
                Text("Add Transaction")
            }
        }.navigationTitle(Text("Transactions"))
    }
}

#Preview {
    ContentView()
}
