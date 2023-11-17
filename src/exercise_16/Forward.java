package exercise_16;

public class Forward extends Player {
    private int goalsScored;

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }
    @Override
    public String toString() {
        return super.toString() + "\nGoles marcados: " + this.getGoalsScored();
    }
}
