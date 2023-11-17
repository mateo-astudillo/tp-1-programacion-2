package exercise_16;

public class Midfielder extends Player {
    public final int max = 4;
    private int assists;

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAsistencias: " + this.getAssists();
    }
}
