package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int num1 = 5;

        String name1 = "Jen";
        String name2 = new String("Gabi");

        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        Person p = new Person();
        p.setName("Jen");
        p.setAge(100);

        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.toString());

        Person p2 = new Person("Betty", 99);
        System.out.println(p2.toString());
    }
}
