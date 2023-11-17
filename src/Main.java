import exercise_1.E1;
import exercise_2.E2;
import exercise_3.E3;
import exercise_4.E4;
import exercise_5.E5;
import exercise_6.E6;
import exercise_7.E7;
import exercise_8.E8;
import exercise_16.E16;
import exercise_17.E17;
import exercise_18.E18;

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
                case "6":
                    E6.run();
                    break;
                case "7":
                    E7.run();
                    break;
                case "8":
                    E8.run();
                    break;
                case "16":
                    E16.run();
                    break;
                case "17":
                    E17.run();
                    break;
                case "18":
                    E18.run();
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
                /*
                "8 - Ejercicio 8",
                "9 - Ejercicio 9",
                "10 - Ejercicio 10",
                "11 - Ejercicio 11",
                "12 - Ejercicio 12",
                "13 - Ejercicio 13",
                "14 - Ejercicio 14",
                "15 - Ejercicio 15",
                 */
                "16 - Ejercicio 16",
                "17 - Ejercicio 17",
                "18 - Ejercicio 18",
        };
        for (String s : exercises) {
            System.out.println(s);
        }
    }
}