package org.example.example;


import org.example.dto.Child;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Child child = new Child();
        child.setName("Elephant");
        child.setAge(5);
        System.out.println("This is my age: " + child.getAge() + "\nthis is my name: " + child.getName());
    }
}