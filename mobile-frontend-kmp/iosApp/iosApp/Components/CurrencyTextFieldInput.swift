//
//  CurrecyInput.swift
//  iosApp
//
//  Created by Wilmer Hurtado on 19/11/24.
//  Copyright © 2024 WH2 Soft. All rights reserved.
//

import SwiftUI

struct CurrencyTextFieldView: View {
    
    @Binding var amount: Decimal // Store value as number
    
    @State var currencySymbol = "COP"
    @FocusState private var isFocused: Bool // Controls keyboard state
    
    var body: some View {
        VStack {
            HStack {
                TextField("0.00", value: $amount, format: .currency(code: currencySymbol))
                    .font(.system(size: 50, weight: .bold))
                    .multilineTextAlignment(.center) // Center text within TextField
                    .keyboardType(.decimalPad)
                    .focused($isFocused) // Manage keyboard focus
                    .onChange(of: amount) { newValue in
                        sanitizeInput()
                    }
                    .onAppear {
                        sanitizeInput() // Ensure format is valid at start
                    }
            }
            .padding()
            .frame(maxWidth: .infinity)
            
        }
        .onTapGesture {
            isFocused = true // Enable keyboard on touch anywhere
        }
    }
    
    /// Ensure the input to be always in a valid currency format
    private func sanitizeInput() {
        // Set amount to zero if the number is either not valid or empty
        if amount < 0 {
            amount = 0
        }
    }
}

#Preview {
    CurrencyTextFieldView(amount: .constant(12.09))
}
