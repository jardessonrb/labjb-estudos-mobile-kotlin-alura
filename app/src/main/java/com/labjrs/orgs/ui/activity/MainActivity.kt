package com.labjrs.orgs.ui.activity;

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labjrs.orgs.R
import com.labjrs.orgs.ui.recyclerview.adapters.ListProdutoAdapter
import com.labjrs.orgs.ui.recyclerview.models.Produto
import java.math.BigDecimal

public class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)
        val recyclerViewProdutos = findViewById<RecyclerView>(R.id.activity_recycler_view_produtos)

        val listaProdutos = listOf<Produto>(
            Produto("Cesta de maçã", "Contém 50 maçãs", BigDecimal("25.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00")),
            Produto("Cesta de Abacate", "Contém 3 abacates", BigDecimal("30.00"))
        )
        recyclerViewProdutos.adapter = ListProdutoAdapter(this, listaProdutos)
        recyclerViewProdutos.layoutManager = LinearLayoutManager(this)
    }
}
