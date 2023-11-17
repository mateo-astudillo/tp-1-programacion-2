package exercise_8;

import java.util.Arrays;
import java.util.Scanner;

public class E8 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String date;
        MyDate myDate = new MyDate();
        String[] dmy;

        System.out.println("Ingrese una fecha (dd-MM-YYYY): " );
        date = scanner.nextLine();

        dmy = date.split("[-/]");

        try {
            if (myDate.setDate( Integer.parseInt(dmy[0]), Integer.parseInt(dmy[1]), Integer.parseInt(dmy[2]))) {
                System.out.println(myDate.getDate());
            } else {
                System.out.println("No es una fecha válida");
            }
        } catch (Exception e) {
            System.out.println("Error de formato: dd-MM-YYYY, con números separados por guines (-) o barras (/) ");
        }



    }

}
