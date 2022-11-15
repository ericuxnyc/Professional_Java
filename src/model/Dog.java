package model;

import java.time.LocalDate;

public class Dog extends Pet{
    public Dog(String name, LocalDate dob) {
        super(name, dob);
    }
//    public String speak() {
//        return "Woof!";
//    }

    public static void main(String[] args) {
        System.out.println("Welcome to Java");
    }
}

