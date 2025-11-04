package com.tasks;

class Car{
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

    public Car(String model,String brand, int year, int price, String color, int quantity){
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void delivery(int amount) {
        if (amount > 0) {
            this.quantity += amount;
            System.out.println(amount + " cars delivered. Updated quantity: " + this.quantity);
        } else {
            System.out.println("Delivery amount must be positive.");
        }
    }

    public void sell(int amount) {
        if (amount > 0 && amount <= this.quantity) {
            this.quantity -= amount;
            System.out.println(amount + " cars sold. Remaining quantity: " + this.quantity);
        } else {
            System.out.println("Invalid sale quantity.");
        }
    }

    @Override
    public String toString() {
        return "Car Details:\n" + "--------------\n" +
                "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Year: " + year + "\n" +
                "Price: $" + price + "\n" +
                "Color: " + color + "\n" +
                "Quantity: " + quantity;
    }
}


public class CarInfo {
    public static void main(){
        Car car1 = new Car("Mustang", "Ford", 2024, 400000,"Red",10);
        System.out.println(car1.toString());
        car1.sell(5);

        // Printing all fields using get methods
        System.out.println("\nAfter Selling:");
        System.out.println("--------------");
        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: $" + car1.getPrice());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Quantity: " + car1.getQuantity());

        car1.delivery(2);
        car1.setColor("Brown");
        car1.setModel("A4");
        car1.setBrand("Audi");
        car1.setPrice(280000);
        car1.setYear(2023);
        car1.delivery(9);

        // Printing toString() again to see changes
        System.out.println("\nAfter Updates:");
        System.out.println("--------------");
        System.out.println(car1.toString());
    }
}
