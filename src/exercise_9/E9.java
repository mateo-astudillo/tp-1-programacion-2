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

        Student student = new Student("Julian", 15, new float[]{9, 8, 7});
        student.study();
        student.doHomeWork();
        student.takingTest();

        Vehicle vehicle = new Vehicle("Ford", "Fiesta", 2017);
        vehicle.startUp();
        vehicle.speedUp();
        vehicle.curb();

        Book book = new Book("Yo antes de Tí", "Jojo Moyes", "Penguin books");
        book.render();
        book.read();
        book.giveBack();

        Pet pet = new Pet("Mishino", 3, "Gato");
        pet.eat();
        pet.play();
        pet.sleep();

        Employee employee = new Employee("Juan", 20_000, 26);
        employee.work();
        employee.collectSalary();
    }
}
