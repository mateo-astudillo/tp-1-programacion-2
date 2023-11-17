package exercise_6;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String option;
       float radius;
       System.out.println(
               "a - Calcular la superficie de una esfera\n" +
               "b - Calcular el volumen de una esfera"
       );
       option = scanner.nextLine();
       System.out.print("Inserte el radio: ");
       radius = scanner.nextFloat();
       if (option.equals("a")) {
           System.out.println("La superficie de la esfera de radio: " +
                   radius + " es: " + sphereSurface(radius)
           );
       }
       if (option.equals("b")) {
           System.out.println("El volumen de la esfera de radio: " +
                   radius + " es: " + sphereVolume(radius)
           );
       }
    }

    private static float sphereSurface(float radius) {
        return (float) (4 * Math.PI * Math.pow(radius, 2));
    }

    private static  float sphereVolume(float radius) {
        return (float) ( (4/3) * Math.PI * Math.pow(radius, 3) );
    }
}
