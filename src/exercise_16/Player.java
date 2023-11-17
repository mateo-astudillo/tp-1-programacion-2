package exercise_16;

public abstract class Player extends Person {
    private boolean starter;

    public boolean isStarter() {
        return starter;
    }

    public void setStarter(boolean starter) {
        this.starter = starter;
    }

    @Override
    public String toString() {
        String starter = (this.starter) ? "titular" : "suplente";
        return this.getFirstName() + " " + this.getLastName() + ", " + this.getAge() + "\n" + starter;
    }
}
