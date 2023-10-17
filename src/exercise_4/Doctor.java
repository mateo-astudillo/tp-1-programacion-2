package exercise_4;

public class Doctor extends Person {
    private String specialty;
    private int tuition;

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getTuition() {
        return this.tuition;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
    }
}
