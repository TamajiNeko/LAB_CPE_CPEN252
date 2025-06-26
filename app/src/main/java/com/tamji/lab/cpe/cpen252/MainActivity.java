package com.tamji.lab.cpe.cpen252;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

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

//        int numMsg;
//
//        numMsg = 10;
//        Log.i("numMsg",""+numMsg);
//
//        numMsg++;
//        numMsg = numMsg + 1;
//        Log.i("numMsg", ""+numMsg);

        boolean friend = true;
        Log.i("friend", ""+friend);
        String contract = "Neko";
        String msg = "Welcome to Neko App";

        Toast.makeText(this, "Message form "+contract, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}