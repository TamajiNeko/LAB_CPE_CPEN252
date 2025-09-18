package com.tamji.lab.cpe.neko_note;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Date;
import java.util.concurrent.Executors;

public class AddNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        // Set the status bar color
        window.setStatusBarColor(getResources().getColor(R.color.neko));
        Button homeButton = findViewById(R.id.backButton);
        Button addButton = findViewById(R.id.addButton);

        EditText titleInput = findViewById(R.id.titleInput);
        EditText contentInput = findViewById(R.id.contentInput);
/*        TextView textSaved = findViewById(R.id.textSaved);*/

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String title = titleInput.getText().toString();
                String content = contentInput.getText().toString();
                String date = DateCreator.format(new Date());

                TextNote note = new TextNote(null, null, null, null);
/*              CheckList list = new CheckList("Note List");*/

                User fakeUser = new User();
                fakeUser.addUser("Tamji Neko", 33550337);
                String author = fakeUser.getUserInformation();

                if (title.isEmpty()) {
                    title = "Untitled Note";
                }

                note.setContent(title, content, date, author);

                //Check List (Unused)
/*              String packageName = getPackageName();
                for (int i = 0; i < 3; i++) {
                    String item = "item"+i;
                    String checkBox = "checkBox"+i;
                    int itemId = getResources().getIdentifier(item, "id", packageName);
                    int checkId = getResources().getIdentifier(checkBox, "id", packageName);
                    EditText checkBoxContent = findViewById(itemId);
                    CheckBox checkBoxBoolean = findViewById(checkId);

                    if (Build.VERSION.SDK_INT >= 35) {
                        if (checkBoxContent.getText().isEmpty()){
                            continue;
                        }else {
                            boolean checked = checkBoxBoolean.isChecked();
                            list.addItems(checkBoxContent.getText().toString(), checked);
                        }
                    }
                }*/

                NoteEntity entity = NoteMapper.toEntity(note);

                Context context = v.getContext();
                Executors.newSingleThreadExecutor().execute(() -> {
                    AppDatabase.getInstance(context).noteDao().insert(entity);
                });
                Toast.makeText(getApplicationContext(), "Note Saved! ヾ(≧▽≦*)o", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}