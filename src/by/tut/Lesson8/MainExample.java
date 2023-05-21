package by.tut.Lesson8;

public class MainExample {
    /**
     * this method returns child if i ask him
     *
     * @param args - help me to choose
     */
    public static void main(String[] args) {
        Parent badParent = new Child();
        final int myInt = 5;
        badParent.setName("Tom");
        System.out.println(badParent.getName());
        BadParent superBadParent = new BadParent();
        Personable personable = new BadParent();

    }

    public static int fib(int param) {
        if (param == 0 || param == 1) return 1;
        return fib(param - 1) + fib(param - 2);
    }
}
