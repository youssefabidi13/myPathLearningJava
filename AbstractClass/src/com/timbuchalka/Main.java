package com.timbuchalka;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Paul");
        dog.eat();
        dog.breath();
        Bird bird = new Zwijo("Zwijo");
        bird.breath();
        bird.eat();
        bird.fly();
        Penguin jacky = new Penguin("Jacky");
        jacky.fly();
        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}
