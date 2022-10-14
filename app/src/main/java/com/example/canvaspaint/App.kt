package com.example.canvaspaint

import android.app.Application


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(module)
        }
    }
}