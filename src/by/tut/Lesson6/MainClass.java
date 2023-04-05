package by.tut.Lesson6;

public class MainClass {
    public static void main(String[] args) {
//        Car myBmw = new Car();
//        myBmw.color="Green";
//        myBmw.age = 2023;
//        myBmw.brand ="BMW";
//        System.out.println(myBmw.color);
//        System.out.println(myBmw.brand);
//        System.out.println(myBmw.wheelNumber);
//        System.out.println(myBmw.age);
        Car myBestBMW = new Car("Blue", 2023, "BMW", 4, true, "auto");
        System.out.println(myBestBMW.getColor());
        myBestBMW.setColor("Black-Metal");
        System.out.println(myBestBMW.getColor());
        System.out.println(myBestBMW.getKorobka());
        System.out.println(myBestBMW);

        myBestBMW.startEngine();
        myBestBMW.changeSpeed(10);
        myBestBMW.goDirectly();
        myBestBMW.changeSpeed(50);
        myBestBMW.changeSpeed(-30);
        myBestBMW.swichDirection(true);
        myBestBMW.goDirectly();
        myBestBMW.changeSpeed(30);
        myBestBMW.swichDirection(false);
        myBestBMW.sound();
        myBestBMW.changeSpeed(-60);
    }

    private static void sum(int... numbers) {
        int sum = 0;
        for (int val : numbers) {
            sum += val;
        }
        System.out.println("Sum sum" + sum);
    }

}
