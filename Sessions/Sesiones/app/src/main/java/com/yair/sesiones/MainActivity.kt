package com.yair.sesiones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yair.sesiones.SesionesApplication.Companion.prefs
import com.yair.sesiones.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
        checkUserValues()
    }

    fun checkUserValues(){
        if (prefs.getName().isNotEmpty() && prefs.getPassword().isNotEmpty()){
            goToDetail()
        }
    }

    fun initUi(){
        binding.btnSesion.setOnClickListener{ accessToDetail() }
    }
    fun accessToDetail(){
        if (binding.etUsuario.text.toString().isNotEmpty() && binding.etContrasena.text.toString().isNotEmpty()){
            prefs.saveName(binding.etUsuario.text.toString())
            prefs.savePassword(binding.etContrasena.text.toString())
            goToDetail()
        }else{

        }

    }
    fun goToDetail(){
        startActivity(Intent(this, ResultActivity::class.java))
    }
}