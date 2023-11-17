package exercise_13;

public class Truck extends Vehicle {
    private float loadingCapacity; // kg

    protected Truck(String brand, String color, int patent, float loadingCapacity) {
        super(brand, color, patent);
        this.loadingCapacity = loadingCapacity;
    }
}
