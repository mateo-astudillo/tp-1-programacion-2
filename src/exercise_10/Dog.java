package exercise_10;

import java.util.Scanner;

public class Dog extends Pet {
    private final String breed;

    public Dog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del perro");
        this.name = scanner.nextLine();
        System.out.println("Ingrese la raza del perro");
        this.breed = scanner.nextLine();
        super.setPrice();
    }

    @Override
    public void seeDetails() {
        System.out.println(
            "ANIMAL: perro" +
            "\nNOMBRE: " + this.name +
            "\nRAZA: " + this.breed +
            "\nPRECIO: " + this.price
        );
    }
}
