package com.example.rmisael.simon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton Azul,Rojo,Verde,Naranja,Blanco_A,Blanco_R,Blanco_v,Blanco_N;
    Azul = (Button) findViewById(R.id.A)

    List lista = new ArrayList();
    int ran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ran =(int) (Math.random()*4)+1;




    }
}
