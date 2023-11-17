package exercise_7;

import java.util.Scanner;

public class E7 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String secret_phrase = "programacion orientada a objetos"; // La letra 'p' es la posición número 1
        char letter;
        int position;

        do {
            System.out.print("Ingrese una letra: ");
            letter = scanner.nextLine().charAt(0);
            System.out.print("Ingrese la posición: ");
            position = scanner.nextInt();
            scanner.nextLine();

            if (position < 0) {
                System.out.println("Fin");
            } else if (position == 0) {
                System.out.println("Posición no valida");
            } else {
                if (letter == secret_phrase.charAt(position - 1)) {
                    System.out.println("Adivinaste la letra y su posición, felicidades");
                } else {
                    System.out.println("Mala suerte, la próxima será...");
                }
            }
        } while (position >= 0);
    }
}
