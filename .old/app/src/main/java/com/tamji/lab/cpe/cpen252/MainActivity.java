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

    //Expressing yourself Demo app (line 27-43)

        int numMsg;

        numMsg = 10;
        Log.i("numMsg",""+numMsg);

        numMsg++;
        numMsg = numMsg + 1;
        Log.i("numMsg", ""+numMsg);

        boolean friend = true;
        Log.i("friend", ""+friend);
        String contract = "Neko";
        String msg = "Welcome to Neko App";

        Toast.makeText(this, "Message form "+contract, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

        //The Switch Demo app (line 47-58)

        String command = "eat carrot";
        switch (command) {
            case "eat apple":
                Log.i("message","you have been eat Apple");
                break;
            case "eat carrot":
                Log.i("message", "You have been eat Carrot");
                break;
            default:
                Log.i("message","You dont need any food?");
                break;
        }

        //Loops Demo app (line 62-65)

        int x = 5;
        while (x > 0){
            Toast.makeText(this, "X Value : " + x, Toast.LENGTH_SHORT).show();
            x--;
        }

        //Using methods Demo app (line 70-75)

        float circleArea = getCircleArea(5);
        Log.i("result","Result : "+circleArea);
    }
    Float getCircleArea(float radius){
        return (float) (radius*3.14);
    }

    public static void main(String[] args) {
        Animal animalA = new Animal();
        Animal animalB = new Animal();

        Book book1 = new Book();
        Book book2 = new Book();

        animalA.numberOfLeg = 4;
        animalA.hair = false;
        animalA.tail = false;
        animalA.hasShell = false;
/*        animalA.eat("Carrot");*/

        book1.title = "My Dress-Up Darling Vol.1";
        book1.author = "Shinichi Fukuda";
        book1.genre = "Romantic comedy";
        book1.numberOfPages = 32;
        book1.open();
        book1.read(1);
    }
}