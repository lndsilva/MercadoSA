package br.com.local.mercadosa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Mercadoria> listaMercadorias;
    RecyclerView idRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView = findViewById(R.id.idRecylerView);


        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaMercadorias);

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);

        idRecyclerView.setAdapter(adapter);

    }
}