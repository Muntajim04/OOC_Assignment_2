package org.example;

public class Intern extends Employee{
    public Intern(int salary){
        super(salary, 0);
    }

    @Override
    public int payAmount(){
        return salary/2;
    }
}