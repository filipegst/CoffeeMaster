package com.example.coffeemaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeemaster.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

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
        ViewTopicosAdapter = TopicosAdapter(this@MainActivity, listaTopicos)


        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)

        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = ViewTopicosAdapter



        prepararListaTopicos()


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

    }
}