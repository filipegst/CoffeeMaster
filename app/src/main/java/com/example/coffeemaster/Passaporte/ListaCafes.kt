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
        val brasil = Cafes(
            "Brasil Blend",
            "Blend",
            "Suave acidez com notas de castanhas e chocolate ao leite",
            R.drawable.brasil_embalagem,
            R.drawable.torra_brasil_ethiopia,
            getString(R.string.brasil_historia),
            "Corpo:Medio",
            "Processamento:Seco\n                Semi-Lavado",
            "Acidez:Media/Baixa", "Regiao:América Latina"
        )
        listaCafes.add(brasil)

        val colombia = Cafes(
            "Colombia",
            "Origem Unica",
            "Notas de cacau e Nozes",
            R.drawable.colombia_embalagem,
            R.drawable.torra_pike,
            getString(R.string.colombia_historia),
            "Corpo:Medio",
            "Processamento:Lavado",
            "Acidez:Media", "Regiao:América Latina"
        )
        listaCafes.add(colombia)


        val ethiopia = Cafes(
            "Ethiopia",
            "Origem unica",
            "Notas de chocolate meio amargo, pimenta e citrico adocicado",
            R.drawable.ethiopia_embalagem,
            R.drawable.torra_brasil_ethiopia,
            getString(R.string.ethiopia_historia),
            "Corpo:Medio",
            "Processamento:Lavado",
            "Acidez:Alta ", "Regiao:Africa/Arabia"
        )
        listaCafes.add(ethiopia)

        val espresso = Cafes(
            "Espresso Roast",
            "Blend",
            "Notas de caramelo, especiarias,chocolate meio amargo e castanhas",
            R.drawable.espresso_embalagem,
            R.drawable.torra_espresso,
            getString(R.string.espresso_historia),
            "Corpo:Encorpado",
            "Processamento:Lavado  Semi-Lavado",
            "Acidez:Media ", "Regiao:América-latina Ásia/Pacifico"
        )
        listaCafes.add(espresso)

        val pike = Cafes(
            "Pike Place",
            "Blend",
            "Notas de chocolate, canela, cacau e castanha tostada",
            R.drawable.pike_embalagem,
            R.drawable.torra_pike,
            getString(R.string.pike_historia),
            "Corpo:Medio",
            "Processamento:lavado",
            "Acidez:Media ", "Regiao:América Latina"
        )
        listaCafes.add(pike)

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
            "Acidez:Baixa","Regiao:Ásia/Pacifico"
        )
        listaCafes.add(sumatra)
        val verona = Cafes(
            "Verona",
            "Blend",
            "Notas de chocolate meio amargo, caramelo, cacau e açucar caramelizado",
            R.drawable.verona_embalagem,
            R.drawable.sumatra_e_verona,
            getString(R.string.verona_historia),
            "Corpo:Encorpado",
            "Processamento:Lavado\n" +
                    "                    Semi-Lavado",
            "Acidez:Baixa ", "Regiao:América-latina\n" +
                    "              Ásia/Pacifico"
        )
        listaCafes.add(verona)
    }
}
