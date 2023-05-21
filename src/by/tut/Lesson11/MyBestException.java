package by.tut.Lesson11;

import java.util.Scanner;

public class MyBestException extends Throwable {
    public static void main(String[] args) {
        //угадай возрост
        //если плюс минус 5 лет говорим не уугадал
        //если угадал говорим угадал
        //если разбежка в большую сторону (больше 5 лет) - ошибка (видимо охренел)
        //если разбежка в меньшую сторону (больше 5 лет) - ошибка (льстец)
        int currentAge = 30;
        System.out.println("please ,enter guessed age");
        Scanner scanner = new Scanner(System.in);
        int guessedAge = scanner.nextInt();
        try {
            boolean isGameContinue = checkAge(currentAge, guessedAge);
            while (isGameContinue) {
                System.out.println("please ,enter guessed age,again");
                guessedAge = scanner.nextInt();
                isGameContinue = checkAge(currentAge, guessedAge);
            }
        } catch (MyException e) {
            System.out.println("My age is " + e.getAge() + "." + e.getMessage());
            e.printStackTrace();

        }
        System.out.println("This is the end");
    }

    private static boolean checkAge(int currentAge, int guessedAge) throws MyException {
        int result = currentAge - guessedAge;
        if (result == 0) {
            System.out.println("You are right!!");
            return false;
        }
        if (result > -5 && result < 5) {
            System.out.println("Try again,you are close enough");
            return true;
        }
        if (result > 5) throw new MyException("You are not an expert!!!(flirt)", currentAge);
        throw new MyException("You are not an expert!!!(angry)", currentAge);
        //return false;

    }
}
