package exercise_9;

public class BankAccount {
    private float balance;
    private final String titular;

    public BankAccount(float balance, String titular) {
        this.balance = balance;
        this.titular = titular;
    }

    public void deposit(float deposit) {
        this.balance += deposit;
    }

    public float withdraw(float balance) {
        if (this.balance > balance) {
            this.balance -= balance;
            return balance;
        }
        return 0;
    }

    public void printBalance() {
        System.out.println("Saldo de " + this.titular + ": " + this.balance);
    }
}
