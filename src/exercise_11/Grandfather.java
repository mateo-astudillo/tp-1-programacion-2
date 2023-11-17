package exercise_11;

public class Grandfather {
    public String eyes = "azules";
    private String wallet = "abu111";
    protected int age = 63;
    public void printAll() {
        System.out.println("Ojos del abuelo: " + this.eyes +
            "\nBilletera del abuelo: " + this.wallet +
            "\nEdad del abuelo: " + this.age
        );
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }
}
