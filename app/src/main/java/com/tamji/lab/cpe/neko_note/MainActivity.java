package com.tamji.lab.cpe.neko_note;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        Button addButton = findViewById(R.id.button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(getApplicationContext(), AddNoteActivity.class);
                startActivity(newActivity);
            }
        });

    }

/*    public static void main(String[] args) {
        TextNote noteA = new TextNote();
*//*        Note noteB = new TextNote();*//*

*//*        User userA = new User();*//*
*//*        User userB = new User();*//*

        noteA.title = "My favorite thing";
        noteA.author = "NEKO";
        noteA.setContent("Animal : Butterfly\nColor : Purple\nFood : Cupcake");
        noteA.createDate = "7/17/2025 4:12PM\n";

        noteA.getSummary();

*//*        noteB.title = "My lover";
        noteB.author = "Marina";
        noteB.content = "Elysia she is my lover girl.\nshe has pink hair with blue eye her sound so cute~~";
        noteB.createDate = "7/17/2025 4:27PM\n";

        noteB.getSummary();*//*
    }*/
}