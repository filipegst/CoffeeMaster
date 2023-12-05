package com.example.coffeemaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coffeemaster.Passaporte.ListaCafes
import com.example.coffeemaster.Topicos.ListaTopicos
import com.example.coffeemaster.calculadora.Calculadora
import com.example.coffeemaster.databinding.ActivityMainBinding
import com.example.coffeemaster.databinding.ActivityTelaInicialBinding

class TelaInicial : AppCompatActivity() {

    private val binding by lazy {
        ActivityTelaInicialBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.cardInicioTopicos.setOnClickListener{
            val intent =Intent(this,ListaTopicos::class.java)
            startActivity(intent)
        }
        binding.cardInicioPassaporte.setOnClickListener {
            val intent = Intent(this,ListaCafes::class.java)
            startActivity(intent)
        }

        binding.cardInicioCalculadora.setOnClickListener {
            val intent = Intent (this, Calculadora::class.java)
            startActivity(intent)
        }
    }
}