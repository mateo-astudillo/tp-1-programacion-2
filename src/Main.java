import exercise_1.E1;
import exercise_2.E2;
import exercise_3.E3;
import exercise_4.E4;
import exercise_5.E5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            printOptions();
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    E1.run();
                    break;
                case "2":
                    E2.run();
                    break;
                case "3":
                    E3.run();
                    break;
                case "4":
                    E4.run();
                    break;
                case "5":
                    E5.run();
                    break;
            }
        } while (!option.equals("0"));
        scanner.close();
    }

    private static void printOptions() {
        String[] exercises = {
                "0 - Salir",
                "1 - Ejercicio 1",
                "2 - Ejercicio 2",
                "3 - Ejercicio 3",
                "4 - Ejercicio 4",
                "5 - Ejercicio 5",
                "6 - Ejercicio 6",
                "7 - Ejercicio 7",
                "8 - Ejercicio 8",
                "9 - Ejercicio 9",
                "10 - Ejercicio 10",
                "11 - Ejercicio 11",
                "12 - Ejercicio 12",
                "13 - Ejercicio 13",
                "14 - Ejercicio 14",
                "15 - Ejercicio 15",
                "16 - Ejercicio 16",
                "17 - Ejercicio 17",
                "18 - Ejercicio 18",
        };
        for (String s : exercises) {
            System.out.println(s);
        }
    }
}