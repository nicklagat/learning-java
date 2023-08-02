package org.example;

import java.util.Arrays;

public class EntryPoint {
    // this is the entry point of our code execution
    public static void main(String[] args) {
        System.out.println("Hello Nick!!👏🏽");

        // primitives
        int num1 = 30;
        int num2 = 11;
        int result = num1 + num2;
        System.out.println(result);

        // double
        double pie  = 3.14;
        System.out.println(pie);

        // boolean
        boolean isAdult = false;
        System.out.println(isAdult);

        // character
        char a = 's';
        System.out.println(a);


        int amount = 1_000_000;
        System.out.println(amount);
        System.out.println();




        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);


        int[] monthDays = {31,28,30,31};
        System.out.println(Arrays.toString(monthDays));
        System.out.println(Arrays.toString(monthDays));
        System.out.println("-------------------");
        System.out.println(10+10);


        int test = 0;
        ++test;
        System.out.println(test);


        LocalVariable localVariable = new LocalVariable();
        localVariable.method();

        InstanceVariable instanceVariable = new InstanceVariable();
        InstanceVariable instanceVariable1 = new InstanceVariable("German Shepherd");
        System.out.println(instanceVariable1);


        Dog mydog = new Dog("Bulldog","White",2,75.0);
        System.out.println(mydog);
        mydog.setAge(7);
        mydog.setColor("Black");
        System.out.println(mydog);

        Car car = new Car("BMW","V7","Black Matte",2023,4,4,
                "BMW Company Berlin",3600.00,1.00
                );
        car.setColor("Blue");
        car.setYear(2024);
        System.out.println(car);

    }



}