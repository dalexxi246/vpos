//
//  NavigationTemplateView.swift
//  iosApp
//
//  Created by Wilmer Hurtado on 23/11/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct NavigationTemplateView<Content: View>: View {
    
    private var content: Content
    
    init(@ViewBuilder content: () -> Content) {
        self.content = content()
    }
    
    var body: some View {
        if #available(iOS 16, macOS 13, tvOS 16, watchOS 9, visionOS 1, *) {
            NavigationStack {
                content
            }
        } else {
            NavigationView {
                content
            }
        }
    }
}

#Preview {
    NavigationTemplateView() {
        VStack {
            Text("Hello, World!")
            Text("Hello, World!")
            Text("Hello, World!")
        }
    }
}
