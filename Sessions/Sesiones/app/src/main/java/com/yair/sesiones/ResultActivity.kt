package com.yair.sesiones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yair.sesiones.SesionesApplication.Companion.prefs
import com.yair.sesiones.databinding.ActivityMainBinding
import com.yair.sesiones.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()

    }
    fun initUI(){
        binding.btnCerrarSesion.setOnClickListener {
            prefs.wipe()
            onBackPressed()
        }
        val userName = prefs.getName()
        binding.tvName.text = "Bienvenido $userName"
    }
}