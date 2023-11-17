package exercise_17;

import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        Seller seller;

        System.out.println("Ingrese al edad del vendedor");
        age = scanner.nextInt();
        scanner.nextLine();
        try {
            seller = Seller.verifyAge(age);
            System.out.println("Ingrese el nombre del vendedor");
            seller.setFirstName(scanner.nextLine());
            System.out.println("Ingrese el apellido del vendedor");
            seller.setLastName(scanner.nextLine());
            seller.printAttributes();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
