package dominando.android.shopmvvm.model.home

import dominando.android.shopmvvm.model.Produtos

class HomeBusinnes {

    fun getProdutos():List<Produtos>{
        val listaProd = mutableListOf(
            Produtos("https://http2.mlstatic.com/D_NQ_NP_614309-MLB43057909624_082020-W.webp","Notebook",1200.00),
            Produtos("https://http2.mlstatic.com/D_NQ_NP_965770-MLA43260038321_082020-W.webp","Televisão 29 ",3200.00),
            Produtos("https://http2.mlstatic.com/D_NQ_NP_715387-MLA43775429216_102020-V.webp","Celular ",800.00),
            Produtos("https://http2.mlstatic.com/D_NQ_NP_614309-MLB43057909624_082020-W.webp","Fone de ouvido",100.00),
            Produtos("https://http2.mlstatic.com/D_NQ_NP_614309-MLB43057909624_082020-W.webp","Geladeira",1.800),
            Produtos("https://http2.mlstatic.com/manga-naruto-gold-edico-45-D_NQ_NP_609003-MLB31094706561_062019-W.webp","Mangá Naruto",12.00),
            Produtos("https://http2.mlstatic.com/naruto-gold-53-D_NQ_NP_682165-MLB40033950783_122019-W.webp","Mangá Naruto",35.00),
            Produtos("https://http2.mlstatic.com/naruto-gold-60-D_NQ_NP_775255-MLB42314185602_062020-W.webp","Mangá Naruto",12.00),
        )
return listaProd
    }
}