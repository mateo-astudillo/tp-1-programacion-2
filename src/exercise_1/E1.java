package exercise_1;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AtomicIntegerArray qualification;
        qualification = new AtomicIntegerArray(new int[4]);
        int average = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese la nota: ");
            qualification.set(i, scanner.nextInt());
            average += qualification.get(i);
        }

        average /= 4;
        if (average < 0 || average > 10) {
            System.out.println("NOTAS FUERA DE RANGO, 0 a 10");
        } else if (average < 4) {
            System.out.println("LIBRE");
        } else if (average < 7) {
            System.out.println("REGULAR");
        } else if (average < 10) {
            System.out.println("PROMOCIÓN");
        }
    }
}
