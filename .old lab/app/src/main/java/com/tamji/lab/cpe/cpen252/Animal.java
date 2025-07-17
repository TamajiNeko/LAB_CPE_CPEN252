package com.tamji.lab.cpe.cpen252;

import android.util.Log;

public class Animal {
    int numberOfLeg;
    boolean hair;
    boolean tail;
    boolean hasShell;

    void eat(String food){
        System.out.println("Eating " + food);
    };
    void makeSound(String sound){
        System.out.println("*Sound* : " + sound + "!!");
    };
    void move(int steps){
        System.out.println("This animal moved " + steps + "Steps");
    };
    void  sleep(){
        System.out.println("This animal sleeping");
    }
}
