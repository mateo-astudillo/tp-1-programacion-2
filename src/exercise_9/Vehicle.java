package exercise_9;

public class Vehicle {
    private String brand;
    private String model;
    private int age;

    public Vehicle(String brand, String model, int age) {
        this.brand = brand;
        this.model = model;
        this.age = age;
    }

    public void speedUp() {
        System.out.println("Acelerando...");
    }

    public void curb() {
        System.out.println("Frenando...");
    }

    public void startUp() {
        System.out.println("Arrancando el vehículo...");
    }

}
