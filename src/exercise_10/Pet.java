package exercise_10;

import java.util.Scanner;

public abstract class Pet {
    protected String name;
    protected float price;
    public abstract void seeDetails();

    public void setPrice() {
        Scanner scanner = new Scanner(System.in);
        price = 0;
        do {
            System.out.println("Ingrese el precio");
            try {
                price = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Precio incorrecto");
            }

        } while (price <= 0);
    }
}
