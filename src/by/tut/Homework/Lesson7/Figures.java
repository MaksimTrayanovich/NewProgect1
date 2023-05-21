package by.tut.Homework.Lesson7;

public class Figures {
    private int length;
    public int height;

    public Figures(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public Figures() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Figures{" +
                "length='" + length + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
