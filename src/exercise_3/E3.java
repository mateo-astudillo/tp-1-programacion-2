package exercise_3;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int nn = 1;
        int aux;
        int stop;
        System.out.println("¿Cuántos números de la sucesión de Fibonacci quiere que se muestren?");
        stop = scanner.nextInt();
        for (int i = 1; i < stop; i++) {
            System.out.print(n + " - ");
            aux = nn;
            nn += n;
            n = aux;
        }
        System.out.println(n);
    }
}
