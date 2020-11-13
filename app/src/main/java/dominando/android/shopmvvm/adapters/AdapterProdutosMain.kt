package dominando.android.shopmvvm.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dominando.android.shopmvvm.R
import dominando.android.shopmvvm.model.Produtos

class AdapterProdutosMain(
    val listProdutos:MutableList<Produtos>,
    private val clickProduto:(Int) -> Unit
):RecyclerView.Adapter<AdapterProdutosMain.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterProdutosMain.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_produto,parent,false)
        return ViewHolder(view)
    }



    override fun onBindViewHolder(holder: AdapterProdutosMain.ViewHolder, position: Int) {
        holder.bind(listProdutos[position],clickProduto)
    }

    override fun getItemCount(): Int {
       return listProdutos.size
    }
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        fun bind(produto: Produtos, clickProduto: (Int) -> Unit) = with(itemView){
            Picasso.get().load(produto.imgProduto).into(findViewById<ImageView>(R.id.img_produto))
            findViewById<TextView>(R.id.txt_nome_produto).text = produto.nome
            findViewById<TextView>(R.id.txt_valor).text = produto.valor.toString()

            findViewById<ConstraintLayout>(R.id.layout_produto).setOnClickListener {
                clickProduto(this@ViewHolder.adapterPosition)

            }

        }

    }
}