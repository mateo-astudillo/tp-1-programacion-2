package exercise_9;

public class E9 {
    public static void main(String[] args) {
        Person person = new Person("Juan", 25, "Masculino");
        person.printDetails();

        Dog dog = new Dog("firulais", 4, "galgo");
        dog.bark();

        Rectangle rectangle = new Rectangle(4, 5, "Azul");
        rectangle.calculatePerimeter();
        rectangle.calculateArea();

        BankAccount bankAccount = new BankAccount(120000, "José Herrera");
        bankAccount.printBalance();
        bankAccount.deposit(5000);
        bankAccount.printBalance();
        System.out.println("Retiro: " + bankAccount.withdraw(2000));
    }
}
