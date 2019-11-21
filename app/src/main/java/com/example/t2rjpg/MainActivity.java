package com.example.t2rjpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mensaje(View View){
        Toast.makeText(this, "Mensaje emergente",Toast.LENGTH_LONG).show();
    }
}
