package exercise_15;

public abstract class Contact {
    protected int id;
    protected String fullName;
    public abstract void printDetails();
    public abstract void getData();
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
}
