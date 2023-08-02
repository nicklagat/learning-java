package org.example;

public class Dog {

    // Attributes
    private String breed;
    private String color;
    private int age;
    private  double weight;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age != 0){
            this.age = age;
        }

        else {
            System.out.println("The:"+" "+age+" "+"value is invalid age");
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    // Constructors
    public Dog(String breed, String color, int age, double weight) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }









}
