package com.company;

public class Main {

    public static void main(String[] args) {
	// Stream API
    // паттерн builder

     Cat cat =  new Cat.Builder()
             .setAge(12)
    .setName("Tom")
    .addVaclist("v1")
    .setAge(10)
    .setName("T")
    .addVaclist("v2")
    .setAge(115)
    .setName("Jerry")
            .addVaclist("v2")
    .build();
        System.out.println(cat);
    }
}
