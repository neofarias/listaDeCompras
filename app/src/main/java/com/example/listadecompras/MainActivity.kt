package com.example.listadecompras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Implementando o adaptador
        val produtosAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        // definindo o adaptador na lista
        lstProdutos.adapter = produtosAdapter

        //definição do ouvinte do botão
        btn_inserir.setOnClickListener {

            // pegando o valor digitado pelo usuário
            val produto = txt_produto.text.toString()

            //enviado o item para a lista
            produtosAdapter.add(produto)


        }


    }
}