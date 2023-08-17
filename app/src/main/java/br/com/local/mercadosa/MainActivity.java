package br.com.local.mercadosa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Mercadoria> listaMercadorias;
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView = findViewById(R.id.idRecylerView);

        listaMercadorias = new ArrayList<>();

        listaMercadorias.add(
                new Mercadoria(
                        "Orfeu, Café em Grãos Clássico, 1kg",
                        10,
                        69.90,
                        "9",
                        R.drawable.cafe
                )

        );
        listaMercadorias.add(
                new Mercadoria(
                        "Mostarda Heinz 255g",
                        5,
                        10.79,
                        "8",
                        R.drawable.mostarda
                )

        );
        listaMercadorias.add(
                new Mercadoria(
                        "Balança Digital",
                        10,
                        69.90,
                        "9",
                        R.drawable.balanca
                )

        );
        listaMercadorias.add(
                new Mercadoria(
                        "Echo Dot 5ª geração",
                        10,
                        69.90,
                        "9",
                        R.drawable.echo
                )

        );
        listaMercadorias.add(
                new Mercadoria(
                        "Fritadeira Pratic Fryer",
                        10,
                        69.90,
                        "9",
                        R.drawable.fritadeira
                )

        );
        listaMercadorias.add(
                new Mercadoria(
                        "Aptanutri Profutura 3",
                        10,
                        69.90,
                        "9",
                        R.drawable.leite
                )

        );
        listaMercadorias.add(
                new Mercadoria(
                        "Oster Liquidificador",
                        10,
                        69.90,
                        "9",
                        R.drawable.liquidificador
                )

        );
        listaMercadorias.add(
                new Mercadoria(
                        "Mochila de viagem",
                        10,
                        69.90,
                        "9",
                        R.drawable.mochila
                )

        );
        listaMercadorias.add(
                new Mercadoria(
                        "Panela de Pressão",
                        10,
                        69.90,
                        "9",
                        R.drawable.panela
                )

        );
        listaMercadorias.add(
                new Mercadoria(
                        "Tênis Olympikus",
                        10,
                        69.90,
                        "9",
                        R.drawable.tenis
                )

        );


        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaMercadorias);

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);

        idRecyclerView.setAdapter(adapter);

    }
}