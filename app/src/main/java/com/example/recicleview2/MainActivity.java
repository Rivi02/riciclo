package com.example.recicleview2;

import androidx.appcompat.app.AppCompatActivity;import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private final Persona [] persone = {
            new Persona("Renzo", "Tramaglino", R.drawable.jimmy_fermin_bqe0j0b26rq_unsplash),
            new Persona("Ivan", "Lucchini", R.drawable.albert_dera_ilip77sbmoe_unsplash),
            new Persona("Andre", "Castro", R.drawable.austin_wade_x6uj51n5ce8_unsplash__1_),
            new Persona("Gabriele", "Zulini", R.drawable.joseph_gonzalez_ifgrcqhznqg_unsplash),
            new Persona("Vincenzo", "Grazzo", R.drawable.stefan_stefancik_qxevdflbl8a_unsplash)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_persona);
        PersonaAdapter personaAdapter = new PersonaAdapter(persone);
        recyclerView.setAdapter(personaAdapter);    }
}
