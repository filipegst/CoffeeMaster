package com.example.coffeemaster

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class TopicosAdapter constructor(private val getActivity:MainActivity, private val listaTopicos: List <Topicos>):
    RecyclerView.Adapter<TopicosAdapter.MyViewlHolder> () {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewlHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_topicos,parent,false)
        return MyViewlHolder(view)
    }

    override fun getItemCount(): Int {
        return listaTopicos.size
    }

    override fun onBindViewHolder(holder: MyViewlHolder, position: Int) {

        holder.tituloTopicoView.text = listaTopicos[position].titulo
        holder.imagemTopicoView.setImageResource(listaTopicos[position].imagem)

        val itemAtual = listaTopicos[position]
        val cont = holder.cardView.context
        holder.cardView.setOnClickListener{
            val intent = Intent (it.context, TextoCompleto::class.java)

            intent.putExtra("imagem", itemAtual.imagem)
            intent.putExtra("titulo", itemAtual.titulo)
            intent.putExtra("texto", itemAtual.texto)

            it.context.startActivity(intent)
        }
    }

    class MyViewlHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val  tituloTopicoView: TextView = itemView.findViewById(R.id.tituloTopico)
        val imagemTopicoView: ImageView = itemView.findViewById(R.id.ImagemTopico)
        val cardView: CardView = itemView.findViewById(R.id.cardView)

    }
}