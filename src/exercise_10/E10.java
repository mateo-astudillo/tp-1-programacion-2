package exercise_10;

import java.util.ArrayList;
import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Pet> pets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String options = "1 - Agregar mascota" +
                "\n2 - Agregar cliente" +
                "\n3 - Comprar mascota" +
                "\n4 - Ver estadísticas" +
                "\n5 - Salir";
        String option = "", select = "";

        while (!select.equals("5")) {
            System.out.println(options);
            select = scanner.nextLine();
            switch (select) {
                case "1":
                    System.out.println("1 - Perro\n2 - Gato");
                    option = scanner.nextLine();
                    if (option.equals("1")) {
                        pets.add(new Dog());
                    } else {
                        pets.add(new Cat());
                    }
                    break;
                case "2":
                    System.out.println("1 - Vip\n2 - Regular");
                    option = scanner.nextLine();
                    if (option.equals("1")) {
                        clients.add(new ClientVIP());
                    } else {
                        clients.add(new ClientRegular());
                    }
                    break;
                case "3":
                    buy(clients, pets);
                    break;
                case "4":
                    statistics(clients);
                    break;
            }
        }

    }

    public static void buy(ArrayList<Client> clients, ArrayList<Pet> pets) {
        Scanner scanner = new Scanner(System.in);
        String numberClient, numberPet;
        if (clients.isEmpty()) {
            System.out.println("Agrege clientes");
            return;
        } else if (pets.isEmpty()) {
            System.out.println("Agrege mascotas");
            return;
        }
        for (Client c : clients) {
            System.out.println(clients.indexOf(c) + " " + c.name);
        }
        System.out.println("Elija el cliente por su número");
        numberClient = scanner.nextLine();
        for (Pet p : pets) {
            System.out.print(pets.indexOf(p) + " ");
            p.seeDetails();
        }
        System.out.println("Elija la mascota por su número");
        numberPet = scanner.nextLine();
        try {
            if (clients.get(Integer.parseInt(numberClient)).buy(pets.get(Integer.parseInt(numberPet))))
                pets.remove(pets.get(Integer.parseInt(numberPet)));


        } catch (Exception e) {
            System.out.println("No se pudo realizar la compra");
        }
    }

    public static void statistics(ArrayList<Client> clients) {
        for (Client c : clients) {
            c.statistics();
        }
    }
}
