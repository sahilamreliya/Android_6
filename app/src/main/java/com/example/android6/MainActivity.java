package com.example.android6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weigth,hight;
    Button entar;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weigth = findViewById(R.id.etwidth);
        hight = findViewById(R.id.etheight);
        entar = findViewById(R.id.btentar);
        txt = findViewById(R.id.tvans);


        entar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float w = Float.parseFloat(weigth.getText().toString());
                float l = Float.parseFloat(hight.getText().toString());


                float ans = ( w / ((l)*(l))) * 10000;


                txt.setText(""+ans);


            }
        });

    }
}