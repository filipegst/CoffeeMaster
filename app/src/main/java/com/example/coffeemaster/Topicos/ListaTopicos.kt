package com.example.coffeemaster.Topicos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeemaster.Passaporte.ListaCafes
import com.example.coffeemaster.R
import com.example.coffeemaster.calculadora.Calculadora
import com.example.coffeemaster.databinding.ActivityMainBinding

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
            R.id.menu_calculadora -> Intent(this,Calculadora::class.java).apply {
                startActivity(this)
            }

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
        val historiaDoCafe = Topicos("História do Café",
            R.drawable.kaldir,
            getString(R.string.historia_do_cafe),
            getString(R.string.historia_do_cafe2),
            R.drawable.camelo)
        listaTopicos.add(historiaDoCafe)

        val botanicaDoCafe = Topicos("Botânica do Café",
            R.drawable.botanicadocafe,
            getString(R.string.botanicaDoCafe),
            getString(R.string.botanicaDoCafe2),
            R.drawable.botanicadocafe2)
        listaTopicos.add(botanicaDoCafe)

        val colheita = Topicos("Colheita",
            R.drawable.colheita,
            getString(R.string.colheita),
            getString(R.string.colheita2),
            R.drawable.colheita2)
        listaTopicos.add(colheita)

        val poscolheita = Topicos("Pós Colheita",
            R.drawable.poscolheita,
            getString(R.string.póscolheita),
            getString(R.string.póscolheita2),
            R.drawable.poscolheita2)
        listaTopicos.add(poscolheita)

        val secagem = Topicos("Secagem",
            R.drawable.secagem,
            getString(R.string.secagem),
            getString(R.string.secagem2),
            R.drawable.secagem2)
        listaTopicos.add(secagem)

        val classificacao = Topicos("Classificação",
            R.drawable.classificacao,
            getString(R.string.classificaçao),
            getString(R.string.classificacao2),
            R.drawable.classificacao2)
        listaTopicos.add(classificacao)

        val torra = Topicos("Torra",
            R.drawable.torra,
            getString(R.string.torra),
            getString(R.string.torra2),
            R.drawable.torra2)
        listaTopicos.add(torra)

        val metododepreparo = Topicos("Métodos de Preparo",
            R.drawable.metodo,
            getString(R.string.metododepreparo),
            getString(R.string.metododepreparo2),
            R.drawable.metodo2)
        listaTopicos.add(metododepreparo)


    }
}