package exercise_16;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String info() {
        return "Nombre: " + this.getFirstName() +
               "\nApellido: " + this.getLastName() +
               "\nEdad: " + this.getAge();
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
