package com.example.coffeemaster.Passaporte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coffeemaster.databinding.ActivityPassaporteDoCafeBinding


class PassaporteDoCafe : AppCompatActivity() {

    private val binding by lazy {
        ActivityPassaporteDoCafeBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val passaporteNome = binding.passaporteNome
        val passaporteOrigem = binding.passaporteOrigem
        val passaporteImagem = binding.passaporteImagem
        val passaporteTorra = binding.passaporteTorra
        val passaporteHistoria =binding.passaporteHistoria
        val passaporteCorpo = binding.passaporteCorpo
        val passaporteAcidez =binding.passaporteAcidez
        val passaporteProcessamento = binding.passaporteProcessamento
        val passaporteNotas = binding.passaporteNotas
        val passaporteRegiao = binding.passaporteRegiao

        val intent = intent

        val  imagem = intent?.getIntExtra("imagem",0)
        val  torra = intent?.getIntExtra("torra",0)
        val  nome = intent?.getStringExtra("nome")
        val  origem = intent?.getStringExtra("origem")
        val  acidez = intent?.getStringExtra("acidez")
        val  historia = intent?.getStringExtra("historia")
        val  corpo = intent?.getStringExtra("corpo")
        val  processamento = intent?.getStringExtra("processamento")
        val  notas = intent?.getStringExtra("notas")
        val  regiao = intent?.getStringExtra("regiao")



        imagem?.let { passaporteImagem.setImageResource(it) }
        passaporteNome.text = nome
        passaporteOrigem.text = origem
        torra?.let {passaporteTorra.setImageResource(it) }
        passaporteHistoria.text = historia
        passaporteCorpo.text = corpo
        passaporteProcessamento.text = processamento
        passaporteNotas.text = notas
        passaporteRegiao.text = regiao
        passaporteAcidez.text = acidez
    }

    }


