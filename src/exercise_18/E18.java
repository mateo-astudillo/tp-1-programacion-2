package exercise_18;

import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team team;
        Programmer programmer;
        String number, university, programmingLanguage, firstName, lastName;
        int size;
        System.out.print("Ingrese el número del equipo: ");
        number = scanner.nextLine();
        System.out.print("Ingrese la universidad del equipo: ");
        university = scanner.nextLine();
        System.out.print("Ingrese el lenguaje de programación del equipo: ");
        programmingLanguage = scanner.nextLine();
        do {
            System.out.print("Ingrese el número de participantes del equipo (2 o 3): ");
            size = scanner.nextInt();
            scanner.nextLine();
        } while (!Team.validSize(size));
        team = new Team(number, university, programmingLanguage, size);
        while (!team.isCompleted()) {
            System.out.print("Ingrese el nombre del programador: ");
            firstName = scanner.nextLine();
            System.out.print("Ingrese el apellido del programador: ");
            lastName = scanner.nextLine();
            programmer = new Programmer();
            programmer.setFirstName(firstName);
            programmer.setLastName(lastName);
            team.addProgrammer(programmer);
        }
        team.showInfo();
    }
}
