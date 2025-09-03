package com.example.teste;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public void btnClick(View view){
        startActivity(new Intent(this, Activity2.class));
    }

    public void btnAula3(View view) {
        startActivity(new Intent(this, Activity3.class));
    }

    public void btnAula3Tela2(View view){
        startActivity(new Intent(this, Activity4.class));
    }

    public void btnAula3Tela3(View view){
        startActivity(new Intent(this, Activity5.class));
    }

    public void btnAula3Tela4(View view){
        startActivity(new Intent(this, Activity6.class));
    }
}