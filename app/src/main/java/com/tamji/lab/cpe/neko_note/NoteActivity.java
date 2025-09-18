package com.tamji.lab.cpe.neko_note;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

public class NoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        window.setStatusBarColor(getResources().getColor(R.color.neko));

        Button homeButton = findViewById(R.id.backButton);
        TextView searchDisplay = findViewById(R.id.codeRetrunDisplay);
        TextView noteDisplay = findViewById(R.id.noteDisplay);
        TextView apiDisplay = findViewById(R.id.apiDisplay);
        ImageButton searchButton = findViewById(R.id.searchButton);
        ProgressBar progressBar = findViewById(R.id.progressBar2);
        progressBar.setVisibility(View.GONE);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                searchDisplay.setText("");

                new Thread(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    runOnUiThread(() -> {
                        progressBar.setVisibility(View.GONE);
                        searchDisplay.setText("Note not found");
                    });
                }).start();
            }
        });
        Executors.newSingleThreadExecutor().execute( () -> {
            List<NoteEntity> entities = AppDatabase.getInstance(this).noteDao().getAll();
            List<Note> notes = new ArrayList<>();
            for (NoteEntity e : entities) {
                notes.add(NoteMapper.fromEntity(e));
            }

            runOnUiThread(() -> {
                StringBuilder sb = new StringBuilder();
                for (Note n : notes) {
                    sb.append(n.getSummary()).append("\n");
                }
                noteDisplay.setText(sb.toString());
            });
        });
    }
}