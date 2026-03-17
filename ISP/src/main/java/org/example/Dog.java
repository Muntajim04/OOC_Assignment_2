package org.example;

public class Dog implements RunnableAnimal, BarkableAnimal{
    @Override
    public void bark(){
        System.out.println("Dog is barking");
    }

    @Override
    public void run(){
        System.out.println("Dog is running");
    }
}
