//
//  AddTransactionScreen.swift
//  iosApp
//
//  Created by Wilmer Hurtado on 19/11/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct AddTransactionScreen: View {
    let valueLabel: String = "Valor"
    @State var value: String = ""
    @State var description: String = ""
    var body: some View {
        Form {
            CurrecyInput(value: $value, label: valueLabel)
            TextField("Descripción", text: $description)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
    }

}



#Preview {
    AddTransactionScreen()
}
