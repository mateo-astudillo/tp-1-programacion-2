package exercise_9;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void printDetails() {
        System.out.println("Nombre: " + this.name +
                "Edad: " + this.age +
                "Género: " + this.gender
        );
    }
}
