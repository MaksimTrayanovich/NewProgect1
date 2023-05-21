package by.tut.Lesson7;

public class Laptop extends Comp {
    public Laptop(String hdd, String ram, String touchpad) {
        super(hdd, ram); //mother - super
        this.touchpad = touchpad; //children - this
    }

    private String touchpad;

    public String getTouchpad() {
        return touchpad;
    }

    public void setTouchpad(String touchpad) {
        this.touchpad = touchpad;
    }

    @Override
    public void printDisplay() {
        System.out.println("this is laptop display");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "touchpad='" + touchpad + '\'' +
                "} " + super.toString();
    }

}
