package com.example.coffeemaster.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.coffeemaster.Passaporte.ListaCafes
import com.example.coffeemaster.R
import com.example.coffeemaster.Topicos.ListaTopicos
import com.example.coffeemaster.databinding.ActivityCalculadoraBinding

class Calculadora : AppCompatActivity() {
    private val binding: ActivityCalculadoraBinding by lazy {
        ActivityCalculadoraBinding.inflate(layoutInflater)
    }
    var cafe: Int = 0
    var agua: Int = 0
    var proporcao: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.calcular.setOnClickListener {
            calcula()

        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_troca,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.menu_passaporte -> Intent (this, ListaCafes::class.java).apply {
                startActivity(this)
            }
            R.id.menu_conhecimentos -> Intent (this, ListaTopicos::class.java).apply {
                startActivity(this)
            }
            R.id.menu_calculadora -> Intent(this, Calculadora::class.java.apply {
                finish();
                startActivity(getIntent())
            })
        }

        return super.onOptionsItemSelected(item)

    }

    private fun calcula() {
        val cafeInput = binding.textCafe.text.toString()
        val aguaInput = binding.textAgua.text.toString()
        val proporcaoInput = binding.textProporcao.text.toString()

        if (cafeInput.isNotEmpty() && aguaInput.isNotEmpty() && proporcaoInput.isNotEmpty()) {
            val cafe = cafeInput.toInt()
            val agua = aguaInput.toInt()
            val proporcao = proporcaoInput.toInt()

            val novaAgua: Int
            val novoCafe: Int

            if (cafe != this.cafe) {
                novaAgua = cafe * proporcao
                binding.textAgua.setText(novaAgua.toString())
            } else if (agua != this.agua) {
                novoCafe = agua / proporcao
                binding.textCafe.setText(novoCafe.toString())
            } else if (proporcao != this.proporcao && cafe != this.cafe) {
                novaAgua = cafe * proporcao
                binding.textAgua.setText(novaAgua.toString())
            } else if (proporcao != this.proporcao && agua != this.agua) {
                novoCafe = agua / proporcao
                binding.textCafe.setText(novoCafe.toString())
            }else if (proporcao != this.proporcao ) {
                novoCafe = agua / proporcao
                binding.textCafe.setText(novoCafe.toString())
            }

            this.cafe = cafe
            this.agua = agua
            this.proporcao = proporcao
        }
    }



}