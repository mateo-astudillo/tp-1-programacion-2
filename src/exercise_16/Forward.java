package exercise_16;

public class Forward extends Person implements Printable {
    private int goalsScored;

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    @Override
    public void printInfo() {
        String info = super.info();
        System.out.println(info + "\nGoles convertidos: " + this.getGoalsScored());
    }
}
