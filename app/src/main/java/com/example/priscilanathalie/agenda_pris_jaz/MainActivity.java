package com.example.priscilanathalie.agenda_pris_jaz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        Intent i = new Intent(this, Agregar.class);
        startActivity(i);
    }

    public void onListar(View view) {
        Intent i = new Intent(this, Buscar.class);
        startActivity(i);
    }

    public void onEliminar(View view) {
        Intent i = new Intent(this, Eliminar.class);
        startActivity(i);
    }

    public void premodificar(View view) {
        Intent i = new Intent(this, Id_Modificar.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

