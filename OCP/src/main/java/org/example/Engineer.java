package org.example;

public class Engineer extends Employee{
    public Engineer(int salary){
        super(salary, 0);
    }

    @Override
    public int payAmount(){
        return salary;
    }
}
