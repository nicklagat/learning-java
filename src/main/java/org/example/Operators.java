package org.example;

public class Operators {

    public static void main(String[] args) {
        // Declare and initialize variable a
        int a = 10;

        // If-else statement to check if a is greater than 5
        if (a > 5) {
            System.out.println("a is greater than 5");
        } else {
            System.out.println("a is less than 5");
        }

        // Switch statement to print the day of the week based on the value of day
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
        }

        // For loop to print numbers from 0 to 9
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // While loop to print the age while it's less than 10
        int age = 3;
        while (age < 10) {
            System.out.println("The age is: " + age);
            age++;
        }

        // Nested for loop to print a pattern of asterisks
        for (int i = 0; i < 3; i++) { //outer loop
            for (int j = 0; j < 5; j++) { // inner loop
                System.out.print("* ");
            }
            System.out.println();
        }

        // Nested for loop to print all pairs of colors
        String[] colors = {"red", "green", "blue"};
        for (int i = 0; i < colors.length; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                System.out.println(colors[i] + ", " + colors[j]);
            }
        }

        // Nested for loop to find duplicate numbers in an array
        int[] numbers = {1, 2, 3, 2, 4, 5, 6, 5, 7};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate number found: " + numbers[i]);
                }
            }
        }

        // Bubble sort algorithm to sort an array in ascending order
        int[] randoms = {5, 4, 3, 1, 2, 7};
        for (int i = 0; i < randoms.length; i++) {
            for (int j = i + 1; j < randoms.length; j++) {
                if (randoms[i] > randoms[j]) {
                    int temp = randoms[i];
                    randoms[i] = randoms[j];
                    randoms[j] = temp;
                }
            }
        }

        // Print the sorted numbers
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + " ");
        }
    }
}
