package exercise_16;

import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FootballTeam footballTeam;
        String name, country;
        System.out.print("Ingrese el nombre del equipo: ");
        name = scanner.nextLine();
        System.out.print("Ingrese el pais del equipo: ");
        country = scanner.nextLine();
        footballTeam = new FootballTeam(name, country);

        // Goalkeeper
        Goalkeeper goalkeeper = new Goalkeeper();
        goalkeeper.setStarter(true);
        System.out.println("Ingrese el arquero titular");
        System.out.print("Nombre: ");
        goalkeeper.setFirstName(scanner.nextLine());
        System.out.print("Apelldo: ");
        goalkeeper.setLastName(scanner.nextLine());
        System.out.print("edad: ");
        goalkeeper.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("goles recibidos: ");
        goalkeeper.setGoalsReceived(scanner.nextInt());
        scanner.nextLine();
        footballTeam.addGoalkeeper(goalkeeper);

        // Defenders
        Defender defender;
        for (int i = 0; i < 4; i++) {
            defender = new Defender();
            defender.setStarter(true);
            System.out.println("Ingrese los defensores titulares");
            System.out.print("Nombre: ");
            defender.setFirstName(scanner.nextLine());
            System.out.print("Apelldo: ");
            defender.setLastName(scanner.nextLine());
            System.out.print("edad: ");
            defender.setAge(scanner.nextInt());
            scanner.nextLine();
            footballTeam.addDefender(defender);
        }

        // Midfielders
        Midfielder midfielder;
        for (int i = 0; i < 4; i++) {
            midfielder = new Midfielder();
            midfielder.setStarter(true);
            System.out.println("Ingrese los mediocampistas titulares");
            System.out.print("Nombre: ");
            midfielder.setFirstName(scanner.nextLine());
            System.out.print("Apelldo: ");
            midfielder.setLastName(scanner.nextLine());
            System.out.print("edad: ");
            midfielder.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Asistencias: ");
            midfielder.setAssists(scanner.nextInt());
            scanner.nextLine();
            footballTeam.addMidfielder(midfielder);
        }

        // Forwards
        Forward forward;
        for (int i = 0; i < 2; i++) {
            forward = new Forward();
            forward.setStarter(true);
            System.out.println("Ingrese los mediocampistas titulares");
            System.out.print("Nombre: ");
            forward.setFirstName(scanner.nextLine());
            System.out.print("Apelldo: ");
            forward.setLastName(scanner.nextLine());
            System.out.print("edad: ");
            forward.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Goles marcados: ");
            forward.setGoalsScored(scanner.nextInt());
            scanner.nextLine();
            footballTeam.addForwards(forward);
        }
    }
}
