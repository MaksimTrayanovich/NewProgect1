package by.tut.Lesson7;

public class LessonMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("a", "b", "c");
        laptop.setHdd("10");
        PK pk = new PK("a", "b");
        pk.setHdd("20");

//        Comp comp = new Comp("a", "b");
        Comp myBestComputer = new Laptop("c", "d", "e");
        System.out.println(myBestComputer);
        if (myBestComputer.getHdd() == "100") {
            System.out.println("ogogo");
        } else {
            System.out.println("foooo");
        }
//        System.out.println(laptop);
        Airplane plane = new Airplane();
        plane.fly();
        plane.flyWithsound();
        plane.printMessage();

        Duck duck = new Duck();
        duck.fly();
        duck.flyWithsound();
        duck.printMessage();
        Duck[] ducks = new Duck[3];
        Airplane[] airplanes = new Airplane[3];

        Object obj = new Airplane();
        Object obj2 = new Duck();

        if (obj instanceof Airplane){
            ((Airplane)obj).fly();
        }else if (obj instanceof Duck){
            ((Duck)obj).fly();
        }

//        if (plane instanceof Airplane) {
//            ((Airplane) plane).fly();
//        } else if (plane instanceof Duck) {
//            ((Duck) plane).fly();
//        }

        Flyable[] flyingItems = getFlyingItems();
        for (Flyable flyable : flyingItems) {
            flyable.flyWithsound();
        }
    }

    private static Flyable[] getFlyingItems() {
        Flyable[] flyingItems = new Flyable[4];
        flyingItems[0] = new Duck();
        flyingItems[1] = new Airplane();
        flyingItems[2] = new Duck();
        flyingItems[3] = new Airplane();
        return flyingItems;
    }
}
