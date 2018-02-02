package com.example.dlira.uniti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
    }

    public void nextActivityCalc(View view) {
        startActivity(new Intent(this,
                OperatorActivity.class));
    }

    public void nextActivityForm(View view) {
        startActivity(new Intent(this,
                FormActivity.class));
    }

}//End
