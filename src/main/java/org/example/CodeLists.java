package org.example;

import java.util.ArrayList;
import java.util.List;

public class CodeLists {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("Yellow"));

        for(String color : colors){
            System.out.println(color);
        }
    }
}
