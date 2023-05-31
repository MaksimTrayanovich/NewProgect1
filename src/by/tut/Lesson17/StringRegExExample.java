package by.tut.Lesson17;

import by.tut.Lesson8.Parent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegExExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}");
        String testCase = "050-abc-5678-def-9z0y";
        Matcher matcher = pattern.matcher(testCase);
        // System.out.println(pattern.matcher(testCase).matches());
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
        System.out.println("First task: ");
        printFirstLetters(testCase);
        printWithoutLetters(testCase);
        printOnlyLetters(testCase);
        printIfDocumentStartWithANumberThatLessThat150(testCase);
    }
private static void  printIfDocumentStartWithANumberThatLessThat150(String str){
   Pattern pattern = Pattern.compile("1([0-4][0-9]|50).+");
    System.out.println(pattern.matcher(str).matches());
}
    private static void printOnlyLetters(String str) {
        System.out.println(str
                .replaceAll("\\d+-?", "")
                .replaceAll("-", "/"));
    }

    private static void printWithoutLetters(String str) {
        System.out.println(str.replaceAll("[a-z]{3}", "***"));
    }

    private static void printFirstLetters(String str) {
        Pattern pattern = Pattern.compile("(\\d{4})(-[a-z]{3}-)(\\d{4})(-[a-z]{3}-)(\\d)([a-z])(\\d)([a-z])");
        Matcher matcher = pattern.matcher(str);
        //System.out.println(pattern.matcher(str).matches());
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(1) + matcher.group(3));
        }
    }
}
