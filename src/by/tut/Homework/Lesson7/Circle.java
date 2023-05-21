package by.tut.Homework.Lesson7;

public class Circle extends Figures{
    public Circle (int radius,int length,int height){
        super(height,length);
        this.radius = radius;
    }
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
