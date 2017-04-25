package com.example.priscilanathalie.agenda_pris_jaz;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;


public class Buscar extends ActionBarActivity {

    EditText inputSearch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscar);

        DataBase dbHandler;
        dbHandler = new DataBase(this, null, null, 1);
        SQLiteDatabase db = dbHandler.getWritableDatabase();
        Cursor cursor = dbHandler.listarpersonas();

        ListView lvlitems = (ListView) findViewById(R.id.lvlitems);
        lvlitems.setTextFilterEnabled(true);
        final MostrarTodo todoAdapter = new MostrarTodo(this, cursor);
        lvlitems.setAdapter(todoAdapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_buscar, menu);
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
