package exercise_16;

public class TechnicalDirector extends Person {
    private int yearsOfExperience;
    private boolean foreign;

    @Override
    public String toString() {
        String foreign = (this.foreign) ? "Extranjero" : "Nacional";
        return super.toString() + "\nAños de experiencia: " + this.getYearsOfExperience() + "\n" + foreign;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setForeign(boolean foreign) {
        this.foreign = foreign;
    }
}
