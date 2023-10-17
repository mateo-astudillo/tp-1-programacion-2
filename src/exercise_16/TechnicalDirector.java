package exercise_16;

public class TechnicalDirector extends Person implements Printable {
    private int yearsOfExperience;
    private boolean foreign;

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isForeign() {
        return foreign;
    }

    public void setForeign(boolean foreign) {
        this.foreign = foreign;
    }

    @Override
    public void printInfo() {
        String info = super.info();
        if (this.isForeign()) {
            info += "\nExtranjero";
        } else {
            info += "\nNacional";
        }
        System.out.println(info + "\nAños de experiencia: " + this.getYearsOfExperience() +
                "\n");
    }
}
