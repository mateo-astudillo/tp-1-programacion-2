package exercise_16;

public class GoalKeeper extends Player implements Printable {
    private int goalsReceive;

    public int getGoalsReceive() {
        return goalsReceive;
    }

    public void setGoalsReceive(int goalsReceive) {
        this.goalsReceive = goalsReceive;
    }

    @Override
    public void printInfo() {
        String info = super.info();
        System.out.println(info + "\nGoles recibidos: " + this.getGoalsReceive());
    }
}
