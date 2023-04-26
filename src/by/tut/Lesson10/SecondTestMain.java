package by.tut.Lesson10;

import java.util.Arrays;

public class SecondTestMain {
    public static void main(String[] args) {
        String str = "This is my string";
        String str2 = "ThiS is My string";
        System.out.println(str.toLowerCase()); //Текст с маленькой
        System.out.println(str.toUpperCase()); //Текст с большой
        System.out.println(str.equalsIgnoreCase(str2)); //Сравнивает текст в не зависимости от размера

        System.out.println(str.replace('i', 'a')); //Меняет 1 символ на другой
        System.out.println(str.contains("is"));
        System.out.println(str.indexOf("is"));
        System.out.println("This");
        System.out.println(str.indexOf("is",5));

        System.out.println(str.lastIndexOf("is"));
        String str5 = " ";
        String str6 = null;
        System.out.println(str5.isEmpty());
        System.out.println(str5.isBlank());
//        System.out.println(str.replaceFirst("","a"));
//        System.out.println(str.replaceAll("","a"));

        String str4 = "Abra";
        int myVal = 125;
        String result = String.valueOf(myVal);
        String result2 = 125 + "";
        System.out.println(result);
        System.out.println(result2);
        System.out.println(str4 + 2);
        System.out.println(str4.repeat(5));
        System.out.println(str4.startsWith("Ab")); //Верно ли что строчка начинаеться с :
        System.out.println(str4.endsWith("ra"));  //Верно ли что строчка заканчиваеться на :
        String[] myArr = str.split(" "); // Показывает сколько слов в масиве (нужно указать разделители "ПРОБЕЛ")
        System.out.println(Arrays.toString(myArr));
    }
}
