package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class CodeQueue {

    public static void main(String[] args) {

        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Jon",32));
        supermarket.add(new Person("Ane",22));
        supermarket.add(new Person("Spac",12));

        System.out.println(supermarket.peek());
    }

    static record Person(String name,int age){


    }
}
