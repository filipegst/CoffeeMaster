package com.example.coffeemaster.Passaporte

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeemaster.R


class CafeAdapter(private val getActivity: ListaCafes, private val listaCafes: List<Cafes>) :
    RecyclerView.Adapter<CafeAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nome: TextView = itemView.findViewById(R.id.nomeCafe)
        val descricao: TextView = itemView.findViewById(R.id.cafeDescricao)
        val imagem: ImageView = itemView.findViewById(R.id.cafeImagem)
        val cardView: CardView = itemView.findViewById(R.id.CardCafe)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_cafes, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listaCafes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemAtual = listaCafes[position]
        holder.nome.text = itemAtual.nome
        holder.imagem.setImageResource(itemAtual.imagem)
        holder.descricao.text = itemAtual.notas
        holder.cardView.setOnClickListener {
            val intent = Intent(it.context, PassaporteDoCafe::class.java)

            intent.putExtra("imagem", itemAtual.imagem)
            intent.putExtra("nome", itemAtual.nome)
            intent.putExtra("notas", itemAtual.notas)
            intent.putExtra("torra",itemAtual.torra)
            intent.putExtra("origem",itemAtual.origem)
            intent.putExtra("historia",itemAtual.historia)
            intent.putExtra("acidez",itemAtual.acidez)
            intent.putExtra("processamento",itemAtual.processamento)
            intent.putExtra("corpo",itemAtual.corpo)
            intent.putExtra("regiao",itemAtual.regiao)

            it.context.startActivity(intent)
        }

    }


}