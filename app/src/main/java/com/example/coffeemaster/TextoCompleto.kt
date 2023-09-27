package com.example.coffeemaster

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.coffeemaster.databinding.ActivityTextoCompletoBinding

class TextoCompleto : AppCompatActivity(R.layout.activity_texto_completo) {

    private val binding by lazy {
    ActivityTextoCompletoBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        val textoImagem = binding.TextoCompletoImagem
        val textoTitulo = binding.TextoCompletotitulo
        val textoConteudo = binding.TextoCompletoTexto


        val intent = intent

        val  imagem = intent?.getIntExtra("imagem",0)
        val  titulo = intent?.getStringExtra("titulo")
        val  texto = intent?.getStringExtra("texto")

        imagem?.let { textoImagem.setImageResource(it) }
        textoTitulo.text = titulo
        textoConteudo.text = texto

    }
}
