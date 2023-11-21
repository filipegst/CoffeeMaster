package com.example.coffeemaster.Topicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coffeemaster.databinding.ActivityTextoCompletoBinding

class TextoCompleto : AppCompatActivity() {

    private val binding by lazy {
        ActivityTextoCompletoBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        val textoImagem = binding.TextoCompletoImagem
        val textoImagemFinal = binding.TextoCompletoImagemFinal
        val textoTitulo = binding.TextoCompletotitulo
        val textoFinal = binding.TextoCompletofinal
        val textoConteudo = binding.TextoCompletoTexto



        val intent = intent

        val  imagem = intent?.getIntExtra("imagem",0)
        val  imagem2 = intent?.getIntExtra("imagem2",0)
        val  titulo = intent?.getStringExtra("titulo")
        val  texto = intent?.getStringExtra("texto")
        val  texto2 = intent?.getStringExtra("texto2")

        imagem?.let { textoImagem.setImageResource(it) }
        imagem2?.let { textoImagemFinal.setImageResource(it) }
        textoTitulo.text = titulo
        textoConteudo.text = texto
        textoFinal.text = texto2

    }
}
