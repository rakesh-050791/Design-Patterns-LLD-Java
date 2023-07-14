package PrototypePattern;

import java.security.PublicKey;

public class Student implements Prototype{
    int age;
    private int rollnumber;
    String name;

    public Student(int age, int rollnumber, String name){
        this.age = age;
        this.rollnumber = rollnumber;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(age, rollnumber, name);
    }
}
