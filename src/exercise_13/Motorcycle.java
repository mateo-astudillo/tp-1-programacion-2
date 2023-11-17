package exercise_13;

public class Motorcycle extends Vehicle {
    private final int displacement;

    protected Motorcycle(String brand, String color, int patent, int displacement) {
        super(brand, color, patent);
        this.displacement = displacement;
    }
}
