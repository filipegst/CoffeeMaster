package com.example.coffeemaster.Topicos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeemaster.Passaporte.ListaCafes
import com.example.coffeemaster.Passaporte.PassaporteDoCafe
import com.example.coffeemaster.R
import com.example.coffeemaster.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class ListaTopicos : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private var recyclerView: RecyclerView? = null
    private var ViewTopicosAdapter: TopicosAdapter? = null
    private var listaTopicos = mutableListOf<Topicos>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        listaTopicos = ArrayList()
        recyclerView = binding.rvTopicos
        ViewTopicosAdapter = TopicosAdapter(this@ListaTopicos, listaTopicos)


        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)

        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = ViewTopicosAdapter




        prepararListaTopicos()


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_troca,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.menu_passaporte -> Intent (this,ListaCafes::class.java).apply {
            startActivity(this)
            }
            R.id.menu_conhecimentos -> Intent (this,listaTopicos::class.java).apply {
                finish();
                startActivity(getIntent());
            }
        }

        return super.onOptionsItemSelected(item)

    }

    private fun prepararListaTopicos() {
        val topico = Topicos("teste", R.drawable.imagem_padrao, "teste do texto")
        listaTopicos.add(topico)
        val topico2 = Topicos("teste2", R.drawable.imagem_padrao, "teste do segundo texto ")
        listaTopicos.add(topico2)
        val topico3 = Topicos("teste3", R.drawable.imagem_padrao, "teste do terceiro texto ")
        listaTopicos.add(topico3)
        val topico4 = Topicos("teste4", R.drawable.imagem_padrao, "teste do quarto texto ")
        listaTopicos.add(topico4)
        val topico5 = Topicos("historia do cafe", R.drawable.imagem_padrao, getString(R.string.historia_do_cafe))
        listaTopicos.add(topico5)

    }
}