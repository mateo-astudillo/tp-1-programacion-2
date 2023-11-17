package exercise_16;

public class Goalkeeper extends Player {
    private int goalsReceived;

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public void setGoalsReceived(int goalsReceived) {
        this.goalsReceived = goalsReceived;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGoles recividos: " + this.getGoalsReceived();
    }
}
