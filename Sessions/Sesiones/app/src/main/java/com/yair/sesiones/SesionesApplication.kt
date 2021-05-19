package com.yair.sesiones

import android.app.Application

class SesionesApplication:Application() {
    companion object{
        lateinit var prefs:Prefs
    }
    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext)

    }


}