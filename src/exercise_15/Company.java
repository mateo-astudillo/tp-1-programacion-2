package exercise_15;

import java.util.Scanner;

public class Company extends Contact {
    private String landline;
    private String website;
    private int CUIT;

    @Override
    public void printDetails() {
        System.out.println(
            "ID: " + this.id +
            "\nNOMBRE: " + this.fullName +
            "\nTELÉFONO FIJO: " + this.landline +
            "\nSITIO WEB: " + this.website +
            "\nCUIT: " + this.CUIT
        );
    }

    @Override
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NOMBRE: ");
        this.fullName = scanner.nextLine();
        System.out.println("TELÉFONO FIJO: ");
        this.landline = scanner.nextLine();
        System.out.println("SITIO WEB: ");
        this.website = scanner.nextLine();
        System.out.println("CUIT: ");
        do {
            try {
                this.CUIT = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("El documento debe ser un número");
                this.CUIT = 0;
            }
        } while (this.CUIT == 0);
    }
}
