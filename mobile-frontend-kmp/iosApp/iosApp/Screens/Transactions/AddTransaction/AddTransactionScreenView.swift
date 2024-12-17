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
    @State var value: String = ""
    @State var description: String = ""
    @State var categorySelection: Category?
    
    let submitAction: () -> Void = {
        print("Transaccion ")
    }
    var body: some View {
        NavigationTemplateView {
            Form {
                Section(header: Text("Datos de la transacción")) {
                    CurrecyInput(value: $value, label: valueLabel)
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
    AddTransactionScreenView()
}
