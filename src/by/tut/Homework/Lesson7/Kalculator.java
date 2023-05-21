package by.tut.Homework.Lesson7;

public class Kalculator {
    public static void main(String[] args) {
        Figures figures = new Figures(100, 100);
        Figures triangle = new Triangle(15, 16);
        Figures circle = new Circle(17, 18, 19);
        Figures rectangle = new Rectangle(20, 21);
        int Square1 = 0;
        Square1 = triangle.height * triangle.getLength();
        System.out.println("Square triangle = " + Square1);
        int Square2 = 0;
        Square2 = rectangle.height * rectangle.getLength();
        System.out.println("Square rectangle = " + Square2);
        int Square3 = 0;
        Square3 = circle.height * circle.getLength();
        System.out.println("Square circle = " + Square3);

    }
}
