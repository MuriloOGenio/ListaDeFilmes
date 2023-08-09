package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Filmes> listaFilmes;

    //Declarar o recycler view

    RecyclerView idRecyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView = findViewById(R.id.idListaFilmes);

        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Apocalipse",
                        "Filme legal",
                        "Ação",
                        R.drawable.apocalipe)
        );listaFilmes.add(
                new Filmes("Rei da Monhatanha",
                        "O rei que tá na montanha",
                        "Aventura",
                        R.drawable.rei_montanha)
        );listaFilmes.add(
                new Filmes("Desejos Ocultos",
                        "Desejos que são ocultos",
                        "Ação",
                        R.drawable.apocalipe)
        );listaFilmes.add(
                new Filmes("Apocalips",
                        "Filme legal",
                        "Ação",
                        R.drawable.apocalipe)
        );listaFilmes.add(
                new Filmes("Apocalips",
                        "Filme legal",
                        "Ação",
                        R.drawable.apocalipe)
        );



        MyAdapter adapter = new MyAdapter(getApplicationContext(),listaFilmes);

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        idRecyclerView.setHasFixedSize(true);

        idRecyclerView.setAdapter(adapter);
    }
}