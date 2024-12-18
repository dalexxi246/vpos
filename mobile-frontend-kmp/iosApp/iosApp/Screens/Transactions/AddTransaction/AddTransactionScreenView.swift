//
//  AddTransactionScreen.swift
//  iosApp
//
//  Created by Wilmer Hurtado on 19/11/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct AddTransactionScreenView: View {
    let valueLabel: String = "Valor"
    @State var amount: Decimal = 0
    @State var description: String = ""
    @State var categorySelection: Category?
    
    let submitAction: () -> Void = {
        print("Transaccion ")
    }
    var body: some View {
        NavigationTemplateView {
            VStack {
                CurrencyTextFieldView(amount: $amount)
            }
            Form {
                Section(header: Text("Datos de la transacción")) {
                    TextField("Descripción", text: $description)
    //                Picker("Categoria", selection: Binding<SelectionValue>)
                }
            }
        }
        .navigationTitle(Text("Agregar Transacción"))
        .toolbar {
            ToolbarItem(placement: .topBarTrailing) {
                Button(action: submitAction, label: {
                    Text("Done")
                })
            }
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
    }
}



#Preview {
    AddTransactionScreenView(amount: 94)
}
