package com.example.dlira.uniti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
    private EditText txtName;
    private EditText txtAge;
    private EditText txtPhone;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        //1...
        txtName = (EditText) findViewById(R.id.edt_name);
        txtAge = (EditText) findViewById(R.id.edt_age);
        txtPhone = (EditText) findViewById(R.id.edt_phone);
        btnSubmit = (Button) findViewById(R.id.btn_sub);

        //2...
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //3...
                Intent intent = new Intent(FormActivity.this, DataActivity.class);

                //4...
                Bundle b = new Bundle();
                b.putString("Name", txtName.getText().toString());
                b.putString("Age", txtAge.getText().toString());
                b.putString("Phone", txtPhone.getText().toString());

                //5...
                intent.putExtras(b);

                //6...
                startActivity(intent);
            }
        });
    }

    public void nextActivityData(View view) {
        startActivity(new Intent(this,
                DataActivity.class));
    }

}//End
