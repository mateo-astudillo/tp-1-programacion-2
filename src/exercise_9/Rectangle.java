package exercise_9;

public class Rectangle {
    private final int height;
    private final int width;
    private final String color;

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public void calculatePerimeter() {
        System.out.println("Perimetro " + this.color + ": " + this.height * 2 + this.width * 2);
    }

    public void calculateArea() {
        System.out.println("Área " + this.color + ": " + this.height * this.width);
    }
}
