package exercise_16;

public class Player extends Person {
    private boolean starter;

    public String info() {
        String info = super.info();
        if (this.isStarter()) {
            info += "\nTitular";
        }
        else {
            info += "\nSuplente";
        }
        return info;
    }

    public boolean isStarter() {
        return starter;
    }

    public void setStarter(boolean starter) {
        this.starter = starter;
    }
}
