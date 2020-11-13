package dominando.android.shopmvvm.viewModel

import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dominando.android.shopmvvm.model.Produtos
import dominando.android.shopmvvm.model.home.HomeBusiness

class MainViewModel:ViewModel() {
    private val homeBusiness =HomeBusiness()

val listaAtual:MutableLiveData<List<Produtos>> = MutableLiveData()
    val actFloat :MutableLiveData<Boolean> = MutableLiveData()
    val actBack:MutableLiveData<Boolean> = MutableLiveData()
    val novoProduto:MutableLiveData<Produtos> = MutableLiveData()
    val produtoSelect:MutableLiveData<Produtos> = MutableLiveData()
    val actTotal:MutableLiveData<Boolean> = MutableLiveData()
    val selectotal :MutableLiveData<Double> = MutableLiveData()
    val selectsize = homeBusiness.listaSelect


    fun atualizaSelecionado(produto:Produtos){
        produtoSelect.postValue(produto)
    }

    fun atualizaProduto(produto:Produtos){
        novoProduto.postValue(produto)
    }





    fun getProdutos(){
        listaAtual.postValue(homeBusiness.getProdutos())

    }
    fun atualizaFloat(){
        actFloat.postValue(true)
    }
    fun atualizaBack(){
        actBack.postValue(true)
    }
    fun adicionaProduto(produto:Produtos){
      homeBusiness.addProduto(produto)

    }

    fun adicionaListaSelect(produto: Produtos){
        homeBusiness.addListSelect(produto)


    }
    fun atualizaSelect():List<Produtos>{
        return homeBusiness.listaSelect
    }

    fun atualizaTotal(){
        actTotal.postValue(true)
    }
fun totaliza():Double{
    return homeBusiness.totaliza()
}

}