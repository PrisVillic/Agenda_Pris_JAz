package com.example.priscilanathalie.agenda_pris_jaz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Id_Modificar extends ActionBarActivity {

    EditText modificar_input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.id_modificar);
        modificar_input = (EditText) findViewById(R.id.modificar_input);
    }

    public void modificar_clicked(View view){

        Intent i = new Intent(this, Modificar.class);
        modificar_input = (EditText) findViewById(R.id.modificar_input);
        i.putExtra("id_persona" , modificar_input.getText().toString());
        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_pre_modificar, menu);
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
