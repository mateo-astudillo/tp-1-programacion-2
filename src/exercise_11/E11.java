package exercise_11;

public class E11 {
    public static void main(String[] args) {
        Grandfather grandfather = new Grandfather();
        grandfather.printAll();
        @SuppressWarnings("WriteOnlyObject")
        Father father = new Father();
        father.eyes = "verdes";
        // father.wallet = "padre333";
        father.setWallet("padre333");
    }
}
