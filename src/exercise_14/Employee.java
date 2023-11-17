package exercise_14;

public class Employee {
    private String surname;
    private final int document;
    private float balance;
    private char category;

    public Employee(int document, char category) {
        this.document = document;
        this.category = category;
        switch (category) {
            case 'B':
                this.balance = 300_000;
                break;
            case 'C':
                this.balance = 500_000;
                break;
            default:
                this.category = 'A';
                this.balance = 180_000;
                break;
        }
    }

    public boolean equals(Employee other) {
        return this.document == other.document;
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
    public int getDocument() {
        return document;
    }

    public float getBalance() {
        return balance;
    }

    public char getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return getDocument() + "\t" + getCategory() + "\t\t" + getBalance();
    }
}
