package by.tut.Lesson11;

public class ExceptionExample {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 1 / 0;
            try {

            } catch (Exception e) {

            }
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Ops,something wrong");
            result = 0;
        } catch (Exception e) {
            System.out.println("Ops,something wrong 2 ");
            result = -1;
        } finally {

            System.out.println("this is the end of try block");
        }
        System.out.println(result);
    }
}
