package exercise_16;

public class Forward extends Player {
    public final int max = 2;
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
