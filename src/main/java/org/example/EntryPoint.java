package org.example;

import java.util.Arrays;

public class EntryPoint {
    // This is the entry point of our code execution
    public static void main(String[] args) {
        // Print a greeting message
        System.out.println("Hello Nick!!👏🏽");

        // Declare and initialize integer variables and print their sum
        int num1 = 30;
        int num2 = 11;
        int result = num1 + num2;
        System.out.println(result);

        // Declare and print a double variable
        double pie = 3.14;
        System.out.println(pie);

        // Declare and print a boolean variable
        boolean isAdult = false;
        System.out.println(isAdult);

        // Declare and print a character variable
        char a = 's';
        System.out.println(a);

        // Declare and print an integer with underscores for readability
        int amount = 1_000_000;
        System.out.println(amount);
        System.out.println();

        // Perform and print various arithmetic operations
        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        // Declare and print an array of integers
        int[] monthDays = {31, 28, 30, 31};
        System.out.println(Arrays.toString(monthDays));
        System.out.println("-------------------");

        // Print the sum of two integers
        System.out.println(10 + 10);

        // Increment and print an integer variable
        int test = 0;
        ++test;
        System.out.println(test);

        // Create an object of the LocalVariable class and call its method
        LocalVariable localVariable = new LocalVariable();
        localVariable.method();

        // Create objects of the InstanceVariable class and print one of them
        InstanceVariable instanceVariable = new InstanceVariable();
        InstanceVariable instanceVariable1 = new InstanceVariable("German Shepherd");
        System.out.println(instanceVariable1);

        // Create an object of the Dog class, modify its properties, and print it
        Dog mydog = new Dog("Bulldog", "White", 2, 75.0);
        System.out.println(mydog);
        mydog.setAge(7);
        mydog.setColor("Black");
        System.out.println(mydog);

        // Create an object of the Car class, modify its properties, and print it
        Car car = new Car("BMW", "V7", "Black Matte", 2023, 4, 4,
                "BMW Company Berlin", 3600.00, 1.00
        );
        car.setColor("Blue");
        car.setYear(2024);
        System.out.println(car);
    }
}
