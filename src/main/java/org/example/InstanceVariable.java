package org.example;

public class InstanceVariable {

    // instance variable
    String breed;

    // default constructor
    public InstanceVariable(){
        this.breed = "test";
    }

    public InstanceVariable(String breed){
        this.breed = breed;
    }


    @Override
    public String toString(){
//        return "InstanceVariable{" +
//                "breed='" + breed + '\'' +
//                '}';
        return breed;
    }

}
