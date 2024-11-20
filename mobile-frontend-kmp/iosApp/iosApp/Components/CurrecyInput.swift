//
//  CurrecyInput.swift
//  iosApp
//
//  Created by Wilmer Hurtado on 19/11/24.
//  Copyright © 2024 WH2 Soft. All rights reserved.
//

import SwiftUI

struct CurrecyInput: View {
    @Binding var value: String
    let label: String
    var body: some View {
        TextField(label, text: $value)
            .keyboardType(.decimalPad)
    }
}

#Preview {
    @State var value: String = "329.09"
    @State var label: String = "Valor"
    CurrecyInput(value: $value, label: label)
}
