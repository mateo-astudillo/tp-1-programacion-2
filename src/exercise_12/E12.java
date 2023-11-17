package exercise_12;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        try {
            int edad = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println("Edad: " + edad);
        }
        catch (NumberFormatException nfe) {
            System.out.println("El formato del número es erroneo");
            System.out.println(nfe.getMessage());
        }
        finally{
            System.out.println("Esta línea siempre se imprimirá");
        }
    }
}
