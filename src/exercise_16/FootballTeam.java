package exercise_16;

import java.util.Scanner;

public class FootballTeam {
    private String name;
    private String country;
    private TechnicalDirector technicalDirector;
    private GoalKeeper goalkeeper; // 1
    private Defender[] defenders; // 4
    private Midfielder[] midfielders; // 4
    private Forward[] forwards; // 2

    public FootballTeam(String name, String country) {
        this.setName(name);
        this.setCountry(country);
        this.technicalDirector = new TechnicalDirector();
        this.defenders = new Defender[4];
        this.midfielders = new Midfielder[4];
        this.forwards = new Forward[2];
    }

    public void addPlayer() {
        Scanner scanner = new Scanner(System.in);
        String starter;
        Player p = new Player();
        System.out.print("Nombre del jugador: ");
        p.setFirstName(scanner.nextLine());
        System.out.print("Apellido del jugador: ");
        p.setLastName(scanner.nextLine());
        System.out.print("Edad del jugador: ");
        p.setAge(scanner.nextInt());
        System.out.print("¿Es titular? (s - n):");
        starter = scanner.nextLine();
        p.setStarter(starter.equals("s"));
        String options =
                "1 - Arquero\n" +
                "2 - Defensor\n" +
                "3 - Mediocampista\n" +
                "4 - Delantero\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
