package exercise_16;

public class Midfielder extends Player implements Printable {
    private int numberOfAssists;

    @Override
    public void printInfo() {
        String info = super.info();
        System.out.println(info + "\nNúmero de asistencias: " + this.getNumberOfAssists());
    }

    public int getNumberOfAssists() {
        return numberOfAssists;
    }

    public void setNumberOfAssists(int numberOfAssists) {
        this.numberOfAssists = numberOfAssists;
    }
}
