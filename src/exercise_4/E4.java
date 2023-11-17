package exercise_4;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient p = new Patient();
        System.out.print("Ingrese el nombre del paciente: ");
        p.setName(scanner.nextLine());
        System.out.print("Ingrese el apellido del paciente: ");
        p.setSurname(scanner.nextLine());
        System.out.print("Ingrese el sexo del paciente (m - s):");
        p.setSex(scanner.nextLine());
        System.out.print("Ingrese el dni del paciente: ");
        p.setDocument(scanner.nextInt());
        System.out.print("Ingrese el peso del paciente (kg): ");
        p.setWeight(scanner.nextFloat());
        System.out.print("Ingrese la altura del paciente (m): ");
        p.setHeight(scanner.nextFloat());

        System.out.println(p.getName().toUpperCase() + ", " + p.getSurname().toUpperCase() +
                "\n-----------------------------------" +
                "\nDNI: " + p.getDocument() +
                "\nSEXO: " + p.getSex().toUpperCase() +
                "\nPESO: " + p.getWeight() +
                "\nALTURA: " + p.getHeight() +
                "\nIMC: " + p.bodyMassIndex() +
                "\n-----------------------------------" +
                "\n>> " + p.bodyMassIndexDescription()
        );

    }
}
