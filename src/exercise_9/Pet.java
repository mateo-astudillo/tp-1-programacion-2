package exercise_9;

public class Pet {
    private String name;
    private int age;
    private String species;

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void play() {
        System.out.println(this.name + " está jugando");
    }
    public void sleep() {
        System.out.println(this.name + " está durmiendo");
    }
    public void eat() {
        System.out.println(this.name + " está comiendo");
    }


}
