package exercise_16;

import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {
        FootballTeam footballTeam = new FootballTeam();

    }
    public static int getInt(String message, String failMessage) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.println(message);
                number = Integer.parseInt(scanner.nextLine());
                if (number < 0)
                    continue;
                return number;
            } catch (Exception e) {
                System.out.println(failMessage);
            }
        }
    }
}
