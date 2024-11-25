package com.example.receitas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Recipe( val nameUsuario: String, val IDimagemUsuario: Int, val tituloReceita: String, val IDimagemReceita: Int)

class Adapter (
    private val mylist: List<Recipe>
) : RecyclerView.Adapter<Adapter.MyViewHolder>(){


//Esse método é responsável por criar o layout de cada linha que temos
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.itens_feed, parent, false)
        return MyViewHolder(itemView)
    }
//retorna a quantidade de linhas que tem que ser criada
    override fun getItemCount() = mylist.size


//onde passamos as infromações dinamicas da fonte de dados
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val recipe = mylist[position]
        holder.editNomeUsuario.text = recipe.nameUsuario
        holder.imageUser.setImageResource(recipe.IDimagemUsuario)
        holder.TituloReceita.text = recipe.tituloReceita
        holder.imagemRef.setImageResource(recipe.IDimagemReceita)
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val editNomeUsuario: TextView = itemView.findViewById(R.id.editNomeUsuario)
            val imageUser: ImageView = itemView.findViewById(R.id.imageUser)
            val TituloReceita: TextView = itemView.findViewById(R.id.TituloReceita)
            val imagemRef: ImageView = itemView.findViewById(R.id.imagemRef)

    }

}