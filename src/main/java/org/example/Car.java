package org.example;

public class Car {

    public Car(String model, String engineType, String color, int year, int seats, int numberOfWheels, String manufacturer, double fuelCapacity, double mileage) {

        this.model = model;
        this.engineType = engineType;
        this.color = color;
        this.year = year;
        this.seats = seats;
        this.numberOfWheels = numberOfWheels;
        this.manufacturer = manufacturer;
        this.fuelCapacity = fuelCapacity;
        this.mileage = mileage;
    }

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    private String engineType;
    private String color;
    private int year;
    private int seats;
    private int numberOfWheels;
    private String manufacturer;
    private double fuelCapacity;
    private double mileage;

    @Override
    public String toString(){
        return "Car{" +
                "model='" + model + '\''+
                ", engineType='" + engineType +'\''+
                ", color='" + color + '\''+
                ", year='" + year + '\''+
        '}';
    }

}
