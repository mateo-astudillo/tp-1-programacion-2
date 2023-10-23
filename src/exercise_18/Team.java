package exercise_18;

import java.util.ArrayList;

public class Team {
    private String number;
    private String university;
    private String programmingLanguage;
    private int size;
    private static final int minSize = 2;
    private static final int maxSize = 3;
    private ArrayList<Programmer> programmers;

    public Team(String number, String university, String programmingLanguage, int size) {
        this.number = number;
        this.university = university;
        this.programmingLanguage = programmingLanguage;
        this.size = size;
        this.programmers = new ArrayList<Programmer>();
    }

    public void showInfo() {
        System.out.println(
                "Número de equipo: " + this.number +
                "\nUniversidad: " + this.university +
                "\nLenguaje de promgramación: " + this.programmingLanguage +
                "\nIntegrantes"
        );
        for (Programmer p : this.programmers) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }
    }

    public static boolean validSize(int size) {
        return size >= Team.minSize && size <= Team.maxSize;
    }

    public boolean isCompleted() {
        return this.programmers.size() == this.size;
    }

    public void addProgrammer(Programmer programmer) {
        this.programmers.add(programmer);
    }
}
