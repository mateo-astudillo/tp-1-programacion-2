package exercise_5;

import java.util.Scanner;

public class E5 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Ingrese un número: ");
        number = scanner.nextInt();
        while (true) {
            number -= 1;
            if (isPrime(number)) {
                System.out.println("Número primo anterior: " + number);
                break;
            }
        }
    }

    private static boolean isPrime(int number) {
        int rest = 1;
        int n = 2;
        while ( (n < number / 2) && (rest != 0)) {
            rest = (int) (number % n);
            n++;
        }
        return rest != 0;
    }
}
