package com.example.dlira.uniti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    private TextView txtData;
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        //1...
        txtData = (TextView) findViewById(R.id.txtData);

        //2...
        Bundle bundle = this.getIntent().getExtras();

        //3...
        txtData.setText("Hello: " + bundle.getString("Name") + ", " +
                bundle.getString("Age") + ", " + bundle.getString("Phone"));
    }

}//End
