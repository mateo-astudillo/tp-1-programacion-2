package exercise_17;

public class Seller {
    private String firstName;
    private String lastName;
    private int age;

    public Seller() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    public void printAttributes() {
        System.out.println(this.firstName + " " + this.lastName + " " + this.age);
    }

    public static Seller verifyAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años");
        } else if (age > 70) {
            throw new IllegalArgumentException("La edad no puede ser mayor a 70");
        } else {
            Seller s = new Seller();
            s.setAge(age);
            return s;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
