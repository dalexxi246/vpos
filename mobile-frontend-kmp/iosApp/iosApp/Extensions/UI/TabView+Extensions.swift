//
//  UI+Extensions.swift
//  iosApp
//
//  Created by Wilmer Hurtado on 17/12/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

extension TabView {
    
    func translucentBackground() -> some View {
        self.onAppear {
            configureTabBarAppearance()
        }
    }
    
    private func configureTabBarAppearance() {
        let appearance = UITabBarAppearance()
        
        // Translucent background
        appearance.configureWithDefaultBackground()
        appearance.backgroundEffect = UIBlurEffect(style: .systemUltraThinMaterial)
        appearance.backgroundColor = UIColor.clear
        
        // Assign custom appereance
        UITabBar.appearance().standardAppearance = appearance
        UITabBar.appearance().scrollEdgeAppearance = appearance
    }
    
}

