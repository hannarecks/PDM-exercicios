package com.example.teste;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {
    public static final String TAG = "CICLO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_teste);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    protected void onStart(){
        super.onStart();
        Log.d(TAG, "estou no onStart");
    }

    protected void onResume(){
        super.onResume();
        Log.d(TAG, "estou no onResume");
    }

    public void onRestart(){
        super.onRestart();
        Log.d(TAG, "estou no onRestart");
    }

    public void onPause(){
        super.onPause();
        Log.d(TAG, "estou no onPause");
    }

    public void onStop(){
        super.onStop();
        Log.d(TAG, "estou no onStop");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "estou no onDestroy");
    }

    public void btnClick(View view){
        EditText editText = findViewById(R.id.tempC);
        String celsius = editText.getText().toString();
        Intent intent = new Intent(Activity2.this, Activity1.class);
        intent.putExtra("celsius", celsius);
        startActivity(intent);
    }
}