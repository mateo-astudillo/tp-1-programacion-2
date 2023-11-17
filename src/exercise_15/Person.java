package exercise_15;

import java.util.Scanner;

public class Person extends Contact {
    private String email;
    private String telephoneNumber;
    private int document;
    @Override
    public void printDetails() {
        System.out.println(
            "ID: " + this.id +
            "\nNOMBRE: " + this.fullName +
            "\nEMAIL: " + this.email +
            "\nNÚMERO DE TELÉFONO: " + this.telephoneNumber +
            "\nDOCUMENTO: " + this.document
        );

    }

    @Override
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NOMBRE: ");
        this.fullName = scanner.nextLine();
        System.out.println("EMAIL: ");
        this.email = scanner.nextLine();
        System.out.println("NÚMERO DE TELÉFONO: ");
        this.telephoneNumber = scanner.nextLine();
        System.out.println("DOCUMENTO: ");
        do {
            try {
                this.document = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("El documento debe ser un número");
                this.document = 0;
            }
        } while (this.document == 0);
    }
}
