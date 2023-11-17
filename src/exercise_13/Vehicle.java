package exercise_13;

public abstract class Vehicle {
    private String brand;
    private String color;
    private int patent;

    protected Vehicle(String brand, String color, int patent) {
        this.brand = brand;
        this.color = color;
        this.patent = patent;
    }
}
