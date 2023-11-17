package exercise_9;

public class Employee {
    private final String name;
    private float balance;
    private final int age;

    public Employee(String name, float balance, int age) {
        this.name = name;
        this.balance = balance;
        this.age = age;
    }

    public void work() {
        System.out.println(this.name + " trabajando");
    }

    public void collectSalary() {
        this.balance += 150_000;
        System.out.println(this.name + " cobró, ahora tiene $" + this.balance);
    }
}
