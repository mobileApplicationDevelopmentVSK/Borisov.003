package com.example.myapplication;

import android.content.Intent;
import android.widget.Button;

public class Registr_and_vhod {
    Button btN1;

    public void onClick(){
        Intent intent = new Intent(this, Cod.class);

        startActivity(intent);
    }
}
