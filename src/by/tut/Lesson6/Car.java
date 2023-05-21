package by.tut.Lesson6;

import java.util.SplittableRandom;

public class Car {
    private String color;
    private int age;
    private String brand;
    private int wheelNumber = 4;
    private boolean isRadio = true;
    private String korobka = "Auto";
    {
        age = 2022;
    }
    private int currentSpeed = 0;
    //признаки:
    //цвет,год,марка,кол-во колес,
    // двигатель,кузов,
    // есть ли магнитола,кпп

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", brand='" + brand + '\'' +
                ", wheelNumber=" + wheelNumber +
                ", isRadio=" + isRadio +
                ", korobka='" + korobka + '\'' +
                '}';
    }

    public Car(String color, int age, String brand, int wheelNumber, boolean isRadio, String korobka) {
        this.color = color;
        this.age = age;
        this.brand = brand;
        this.wheelNumber = wheelNumber;
        this.isRadio = isRadio;
        this.korobka = korobka;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public void setRadio(boolean radio) {
        isRadio = radio;
    }

    public void setKorobka(String korobka) {
        this.korobka = korobka;
    }

    public String getColor() {
        return color;
    }

//    public int getAge() {
//        return age;
//    }

    public String getBrand() {
        return brand;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public boolean isRadio() {
        return isRadio;
    }

    public String getKorobka() {
        return korobka;
    }

    public Car() {
    }

    public Car(String color, int age, String brand) {
        this.color = color;
        this.age = age;
        this.brand = brand;
    }

    //действия:
    //завестись,поехать вперед,
    // повернуть ( лево / права),подать сигнал,
    // ускориться ,замедлиться
    public void startEngine() {
        System.out.println("woof-woof");

    }

    public void sound() {
        System.out.println("bee-beep");
    }

    public void goDirectly() {
        System.out.println("my car is going!!!");
    }

    public void swichDirection(boolean isRightOne) {
        if (currentSpeed>30){
            System.out.println("it is to dangerous to swich direction");
            return;
        }
        if (isRightOne) {
            System.out.println("we are moving to right direction");
        } else {
            System.out.println("we are moving to left direction");
        }
    }

    public void changeSpeed(int speedChange) {
        currentSpeed = currentSpeed + speedChange;
        if (speedChange > 0) {
            System.out.println("we are moving faster, our speed is " + currentSpeed);
        } else {
            System.out.println("we are moving slower, our speed is " + currentSpeed);
        }
        if (currentSpeed<=0){
            System.out.println("we finish our best trip!");
        }
    }

}
