package com.yair.sesiones

import android.content.Context

class Prefs(val context:Context) {
    val SHARED_NAME = "Mydtb"
    val SHARED_USER_NAME = "username"
    val SHARED_USER_PASSWORD = "password"

    val storage = context.getSharedPreferences(SHARED_NAME, 0)

    fun saveName(name:String){
        storage.edit().putString(SHARED_USER_NAME, name).apply()
    }
    fun savePassword(password:String){
        storage.edit().putString(SHARED_USER_PASSWORD, password).apply()
    }
    fun getName():String{
        return storage.getString(SHARED_USER_NAME, "")!!
    }
    fun getPassword():String{
        return storage.getString(SHARED_USER_PASSWORD, "")!!
    }
    fun wipe(){
        storage.edit().clear().apply()
    }
}