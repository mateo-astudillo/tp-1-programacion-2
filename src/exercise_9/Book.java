package exercise_9;

public class Book {
    private String title;
    private String author;
    private String editorial;

    public Book(String title, String author, String editorial) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
    }

    public void read() {
        System.out.println("Leyendo el libro " + this.title);
    }

    public void render() {
        System.out.println("Prestar el libro " + this.title);
    }
    public void giveBack() {
        System.out.println("Devolviendo el libro " + this.title);
    }
}
