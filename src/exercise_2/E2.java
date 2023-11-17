package exercise_2;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int average = 0;
        int number;
        System.out.println("Ingrese números positivos a sumar, finaliza con un número negativo " +
                "(este último se incluye en la sumatoria y el promedio)");
        do {
            number = scanner.nextInt();
            total += number;
            average += 1;
        } while (number > 0);
        average = total / average;
        System.out.println("EL total es: " + total + "\nEl promedio es: " + average);
    }
}
