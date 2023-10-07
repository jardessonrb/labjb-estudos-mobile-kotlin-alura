package com.labjrs.orgs.ui.recyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.labjrs.orgs.R
import com.labjrs.orgs.ui.recyclerview.models.Produto

class ListProdutoAdapter(
    private val context: Context,
    private val produtos: List<Produto>
) : RecyclerView.Adapter<ListProdutoAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun populaProdutoView(produto: Produto){
            val nomeTextView = itemView.findViewById<TextView>(R.id.text_view_nome)
            val descriptionTextView = itemView.findViewById<TextView>(R.id.text_view_descricao)
            val valorTextView = itemView.findViewById<TextView>(R.id.text_view_valor)

            nomeTextView.text = produto.nome
            descriptionTextView.text = produto.descricao
            valorTextView.text = produto.valor?.toPlainString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.activity_produto_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = produtos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]

        holder.populaProdutoView(produto)
    }

}
