package dominando.android.shopmvvm.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dominando.android.shopmvvm.R
import dominando.android.shopmvvm.model.Produtos
import dominando.android.shopmvvm.viewModel.MainViewModel


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getProdutos()
        loadfragment(FragmentMain())
        chamaFragCadastro()
        chamaFragMAin()
       produtoNovo()
        adicionaSelecionados()

        viewModel.actTotal.observe(this,{
            loadfragment(FragmentTotaliza())
        })


    }

    private fun adicionaSelecionados() {
        viewModel.produtoSelect.observe(this,{
            viewModel.adicionaListaSelect(it)
        })
    }

    private fun produtoNovo() {
        viewModel.novoProduto.observe(this, {
            viewModel.adicionaProduto(it)

        })
    }

    private fun chamaFragMAin() {
        viewModel.actBack.observe(this, {
            loadfragment(FragmentMain())
        })
    }

    private fun chamaFragCadastro() {
        viewModel.actFloat.observe(this, {
            loadfragment(FragmentCadastroProduto())
        })
    }

    private fun loadfragment(fragment: Fragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.container_frag, fragment)
        ft.commit()

    }


}



