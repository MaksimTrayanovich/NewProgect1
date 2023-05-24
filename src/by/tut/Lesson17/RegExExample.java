package by.tut.Lesson17;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
    public static void main(String[] args) {
        String testString = "This is my 1 test string, - 12345";
        String test2 = "12334";
        Pattern numbers = Pattern.compile("\\d+"); //задание шаблону для поиска цифр
        Matcher numbersMatcher = numbers.matcher(testString);
        System.out.println(numbersMatcher.matches());

        Matcher numbersMatcher2 = numbers.matcher(test2);
        System.out.println(numbersMatcher2.matches());

        if (numbersMatcher.find()){ //найти подходящее под шаблон
            System.out.println(numbersMatcher.start() + " "+ numbersMatcher.end());//дает точное начало и конец подходящего куска строки
            System.out.println(numbersMatcher.group());// возвращает этот кусок
        }

//        while (numbersMatcher.find()) { //найти подходящее под шаблон все значения
//            System.out.println(numbersMatcher.start() + " " + numbersMatcher.end());//дает точное начало и конец подходящего куска строки
//            System.out.println(numbersMatcher.group());// возвращает этот кусок
//
//            numbersMatcher.reset();
           // numbersMatcher.usePattern(Pattern.compile("test"));
            while (numbersMatcher.find()) { //найти подходящее под шаблон все значения
                System.out.println(numbersMatcher.start() + " " + numbersMatcher.end());//дает точное начало и конец подходящего куска строки
                System.out.println(numbersMatcher.group());// возвращает этот кусок

                numbersMatcher.reset();
                numbersMatcher.results()
                        .map(MatchResult::group)
                        .map(String::length)
                        .forEach(System.out::println);

            }
        }
    }