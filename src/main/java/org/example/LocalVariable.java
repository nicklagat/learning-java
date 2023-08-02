package org.example;

public class LocalVariable {

    static int num; // static variable
    int data; // instance variable

    public void method(){
        int num = 10;
        System.out.println("Local Variable: " + num);
        System.out.println("Instance Variable: " + data);
        System.out.println("Class Variable: " + LocalVariable.num);
    }

}
