package org.example;

import java.util.Arrays;

public class ArrayS {

    // ArrayS
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 9;
        numbers[4] = 4;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int[] numbers2 = {7,9,4,3,0,1};
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers2));

        System.out.println("---advance for loop---");

        for(Integer number:numbers2){
            System.out.println(number);
        }

        String[] names = {
                "Mercury",
                "Venus",
                "Earth",
                "Mars",
                "Jupiter",
                "Saturn",
                "Uranus",
                "Neptune",
                "Pluto"
        };

        // Normal for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Enhanced for loop
        for(String name : names){
            System.out.println(name);
        }

        System.out.println("----using streams-----");

        // Using streams
        Arrays.stream(names).forEach(System.out::println);



        // 2D Arrays

    }



}
