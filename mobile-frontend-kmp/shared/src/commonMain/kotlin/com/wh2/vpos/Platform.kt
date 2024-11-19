package com.wh2.vpos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform