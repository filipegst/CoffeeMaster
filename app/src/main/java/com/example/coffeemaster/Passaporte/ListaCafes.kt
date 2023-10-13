package com.example.coffeemaster.Passaporte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeemaster.R
import com.example.coffeemaster.Topicos.ListaTopicos
import com.example.coffeemaster.databinding.ActivityListaCafesBinding

class ListaCafes : AppCompatActivity() {

    private val binding by lazy {
        ActivityListaCafesBinding.inflate(layoutInflater)
    }

    private var recyclerView: RecyclerView? = null
    private var ViewCafesAdapter: CafeAdapter? = null
    private var listaCafes = mutableListOf<Cafes>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        listaCafes = ArrayList()
        recyclerView = binding.recyclerCafes
        ViewCafesAdapter = CafeAdapter(this@ListaCafes,listaCafes)

        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.adapter = ViewCafesAdapter
        preparaListaCafes()


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_troca, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_conhecimentos -> Intent(this, ListaTopicos::class.java).apply {
                startActivity(this)
            }

            R.id.menu_passaporte -> Intent(this, ListaCafes::class.java).apply {
                finish();
                startActivity(getIntent());
            }
        }

        return super.onOptionsItemSelected(item)

    }


    private fun preparaListaCafes() {
        val sumatra = Cafes(
            "Sumatra",
            "Origem Unica",
            "Terosso com notas herbais e de Especiarias",
            R.drawable.sumatra_embalagem,
            R.drawable.sumatra_e_verona,
            getString(
                R.string.sumatra_historia
            ),
            "Corpo:Encorpado",
            "Processamento:Semi-Lavado",
            "Acidez:Baixa","Regiao:Asia/Pacifico"
        )
        listaCafes.add(sumatra)
        val sumatra2 = Cafes(
            "Sumatra",
            "Origem Unica",
            "Notas herbais e de Especiarias",
            R.drawable.imagem_padrao,
            R.drawable.imagem_padrao,
            "blablablablalba",
            "Corpo:Encorpado",
            "Processamento:Semi-Lavado",
            "Acidez:Baixa", "Asia/Pacifico"
        )
        listaCafes.add(sumatra2)
        val brasil = Cafes(
            "Brasil Blend",
            "Blend",
            "Notas de castanhas, nozes e chocolate ao leite",
            R.drawable.brasil_embalagem,
            R.drawable.torra_brasil_ethiopia,
            "blablablablalba",
            "Corpo:medio",
            "Processamento:Lavado e semi-lavado",
            "Acidez:Media/Baixa", "Regiao:America Latina"
        )
        listaCafes.add(brasil)
    }
}
