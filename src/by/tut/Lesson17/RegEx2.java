package by.tut.Lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        List<String> testString = Arrays.asList("ABC", "abc", "f", "F", "", "a1a", "a11", "a.1", "a..1");
        //Pattern pattern = Pattern.compile("[a-z]");
        //Pattern pattern = Pattern.compile("[a-z]+");//все
        //Pattern pattern = Pattern.compile("[a-z]*");//все + знаки
        //Pattern pattern = Pattern.compile("[a-z]?");// только 0,1
        //Pattern pattern = Pattern.compile("[a-z]{2,3}");// от 2 до 3
        //Pattern pattern = Pattern.compile("[a-zA-Z]+");//и маленькие и большие все
        //Pattern pattern = Pattern.compile("[a-z]+",Pattern.CASE_INSENSITIVE);//и мал и большие
        //Pattern pattern = Pattern.compile("[^a-z]+");//все кроме маленьких
        //Pattern pattern = Pattern.compile("[a-z]+\\d+[a-z]+");//1 буква 1 число и 1 буква
        //Pattern pattern = Pattern.compile("[a-z]+\\d+$");//конец строки
        //Pattern pattern = Pattern.compile("^[a-z]+\\d+");// начало строки
        //Pattern pattern = Pattern.compile("[a-z]+\\.\\d+");// точка
        //Pattern pattern = Pattern.compile("[a-z]+.\\d+");//любой символ
        Pattern pattern = Pattern.compile("([a-z]+.)(\\d+)");
        testString.forEach(str -> {
            Matcher matcher = pattern.matcher(str);
           // System.out.println(str + " matches? " + matcher.matches());
            if (matcher.find()){
                System.out.println("First group: "+ matcher.group(1));
                System.out.println("Second group: "+ matcher.group(2));
            }
        });
    }
}
