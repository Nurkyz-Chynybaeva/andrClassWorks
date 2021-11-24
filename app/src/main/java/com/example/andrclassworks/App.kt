package com.example.andrclassworks

import android.app.Application
import android.util.Log

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.e("App", "onCreate")
    }

}