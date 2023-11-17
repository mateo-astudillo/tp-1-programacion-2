package exercise_10;

import java.util.Scanner;

public class Cat extends Pet {
    public Cat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del gato");
        this.name = scanner.nextLine();
        super.setPrice();
    }

    @Override
    public void seeDetails() {
        System.out.println(
            "ANIMAL: gato" +
            "\nNOMBRE: " + this.name +
            "\nPRECIO: " + this.price
        );
    }
}
