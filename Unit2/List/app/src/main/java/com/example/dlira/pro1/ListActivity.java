package com.example.dlira.pro1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    ListView listTours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listTours = (ListView)findViewById(R.id.lv01);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.recorridos,
                android.R.layout.simple_list_item_1);
        listTours.setAdapter(adapter);
    }

}//End
