package exercise_16;

import java.util.Scanner;

public class FootballTeam {
    private String name;
    private String country;
    private Player[] players;

    public FootballTeam(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public FootballTeam() {
        Scanner scanner = new Scanner(System.in);
        String name, country;
        System.out.print("Ingrese el nombre del equipo: ");
        name = scanner.nextLine();
        System.out.print("Ingrese el pais del equipo: ");
        country = scanner.nextLine();
        new FootballTeam(name, country);

        // PLAYERS
        players = new Player[11];

        // Goalkeeper
        players[0] = new Goalkeeper();
        System.out.println("Ingrese el nombre del arquero: ");
        players[0].setFirstName(scanner.nextLine());
        System.out.println("Ingrese el apellido del arquero: ");
        players[0].setLastName(scanner.nextLine());
        players[0].setAge(E16.getInt("Ingrese al edad del arquero", "Edad incorrecta"));
        players[0].setStarter(true);

        for (int i = 1; i < 5; i++) {
            players[i] = new Defender();
            System.out.println("Ingrese el nombre del defensor: ");
            players[i].setFirstName(scanner.nextLine());
            System.out.println("Ingrese el apellido del defensor: ");
            players[i].setLastName(scanner.nextLine());
            players[i].setStarter(true);
            players[i].setAge(E16.getInt("Ingrese la edad del defensor", "Edad incorrecta"));
        }

        for (int i = 5; i < 9; i++) {
            players[i] = new Midfielder();
            System.out.println("Ingrese el nombre del mediocampista: ");
            players[i].setFirstName(scanner.nextLine());
            System.out.println("Ingrese el apellido del mediocampista: ");
            players[i].setLastName(scanner.nextLine());
            players[i].setStarter(true);
            players[i].setAge(E16.getInt("Ingrese la edad del mediocampista", "Edad incorrecta"));
        }

        for (int i = 9; i < 11; i++) {
            players[i] = new Forward();
            System.out.println("Ingrese el nombre del atacante: ");
            players[i].setFirstName(scanner.nextLine());
            System.out.println("Ingrese el apellido del atacante: ");
            players[i].setLastName(scanner.nextLine());
            players[i].setStarter(true);
            players[i].setAge(E16.getInt("Ingrese la edad del atacante", "Edad incorrecta"));
        }


    }

    public void showInfo() {
        System.out.println(this.name + " " + this.country);
    }



}
