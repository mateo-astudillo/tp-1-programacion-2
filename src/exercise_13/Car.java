package exercise_13;

public class Car extends Vehicle {
    private int numberOfSeats;

    protected Car(String brand, String color, int patent, int numberOfSeats) {
        super(brand, color, patent);
        this.numberOfSeats = numberOfSeats;
    }
}
