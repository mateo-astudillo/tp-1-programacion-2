package exercise_15;

import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[100];
        int lastContact = 0;
        Scanner scanner = new Scanner(System.in);
        String options = "1 - Agregar contacto (empresa o persona)\n" +
                "2 - Mostrar contacto por ID\n" +
                "3 - Editar contacto por ID\n" +
                "4 - Ver libreta completa\n" +
                "5 - Salir";
        String option = "";
        while (!option.equals("5")) {
            System.out.println(options);
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    if (lastContact < 100) {
                        addContact(contacts, lastContact);
                        lastContact += 1;
                    } else {
                        System.out.println("Libreta llena");
                    }
                    break;
                case "2":
                    showContact(contacts, lastContact);
                    break;
                case "3":
                    editContact(contacts, lastContact);
                    break;
                case "4":
                    showContacts(contacts, lastContact);
                    break;
                default:
                    break;
            }
        }
    }

    public static void addContact(Contact[] contacts, int lastContact) {
        System.out.println("1 - Persona\n2 - Empresa");
        String option = new Scanner(System.in).nextLine();
        if (option.equals("1")) {
            Person contact = new Person();
            contact.getData();
            contacts[lastContact] = contact;
        } else {
            Company contact = new Company();
            contact.getData();
            contacts[lastContact] = contact;
        }
    }

    public static void editContact(Contact[] contacts, int lastContact) {
        if (lastContact == 0) {
            return;
        }
        int id = 0;
        do {
            try {
                System.out.println("Igrese el id (1 a " + lastContact + "): ");
                id = Integer.parseInt(new Scanner(System.in).nextLine());
            } catch (Exception e) {
                System.out.println("El documento debe ser un número");
            }
        } while (id < 1 || id > lastContact);
        Contact contact = contacts[id - 1];
        contact.printDetails();
        contact.getData();
    }

    public static void showContact(Contact[] contacts, int lastContact) {
        if (lastContact == 0) {
            return;
        }
        int id = 0;
        do {
            try {
                System.out.println("Igrese el id (1 a " + lastContact + "): ");
                id = Integer.parseInt(new Scanner(System.in).nextLine());
            } catch (Exception e) {
                System.out.println("El documento debe ser un número");
            }
        } while (id < 1 || id > lastContact);
        Contact contact = contacts[id - 1];
        contact.printDetails();
    }

    public static void showContacts(Contact[] contacts, int lastContact) {
        for (int i = 0; i < lastContact; i++) {
            System.out.println("------------------------");
            contacts[i].printDetails();
        }
    }
}
