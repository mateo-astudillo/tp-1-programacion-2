package exercise_9;

public class Student {
    private final String name;
    private final int age;
    private final float[] ratings;

    public Student(String name, int age, float[] ratings) {
        this.name = name;
        this.age = age;
        this.ratings = ratings;
    }

    public void study() {
        System.out.println(this.name + " está estudiando");
    }

    public void doHomeWork() {
        System.out.println(this.name + " está haciendo la tarea");
    }

    public void takingTest() {
        System.out.println(this.name + " está tomando un examen");
    }
}
