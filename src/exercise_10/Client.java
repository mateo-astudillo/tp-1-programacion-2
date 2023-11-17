package exercise_10;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Client {
    protected String name;
    protected String surname;
    protected ArrayList<Pet> pets;
    protected float balance;

    public Client() {
        this.pets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        this.name = scanner.nextLine();
        System.out.println("Ingrese el apellido");
        this.surname= scanner.nextLine();
        setBalance();
    }

    protected void setBalance() {
        Scanner scanner = new Scanner(System.in);
        balance = 0;
        do {
            System.out.println("Ingrese el saldo");
            try {
                balance = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Saldo incorrecto");
            }

        } while (balance <= 0);
    }
    public boolean buy(Pet pet) {
        if (this.balance - pet.price < 0) {
            return false;
        }
        this.balance -= pet.price;
        this.pets.add(pet);
        return true;
    }

    public void statistics() {
        System.out.println(name + " , saldo: " + balance + "\nMacotas");
        for (Pet p : pets) {
            System.out.println(p.name + " " + p.price);
        }
    }
}
