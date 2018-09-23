package com.example.david.basicexamplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        // Creamos la lista de elementos a ser mostrados:
        String[] nombres = new String[] {"David", "Juan","Ana", "Dario", "Ulises","Karen","Amparo", "Iván","Lyssette", "Rubén", "León "};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,nombres);

        listView.setAdapter(arrayAdapter);


    }
}
