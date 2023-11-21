package com.example.coffeemaster.Topicos

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeemaster.R

class TopicosAdapter constructor(
    private val getActivity: ListaTopicos,
    private val listaTopicos: List<Topicos>
) :
    RecyclerView.Adapter<TopicosAdapter.ViewlHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewlHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_topicos, parent, false)
        return ViewlHolder(view)
    }

    override fun getItemCount(): Int {
        return listaTopicos.size
    }

    override fun onBindViewHolder(holder: ViewlHolder, position: Int) {

        holder.tituloTopicoView.text = listaTopicos[position].titulo
        holder.imagemTopicoView.setImageResource(listaTopicos[position].imagem)

        val itemAtual = listaTopicos[position]
        holder.cardView.setOnClickListener {
            val intent = Intent(it.context, TextoCompleto::class.java)

            intent.putExtra("titulo", itemAtual.titulo)
            intent.putExtra("imagem", itemAtual.imagem)
            intent.putExtra("texto", itemAtual.texto)
            intent.putExtra("texto2", itemAtual.texto2)
            intent.putExtra("imagem2", itemAtual.imagem2)
            it.context.startActivity(intent)
        }
    }

    inner class ViewlHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tituloTopicoView: TextView = itemView.findViewById(R.id.tituloTopico)
        val imagemTopicoView: ImageView = itemView.findViewById(R.id.ImagemTopico)
        val cardView: CardView = itemView.findViewById(R.id.cardView)

    }
}