package by.tut.Lesson10;

public class TestMain {
    public static void main(String[] args) {
        String str = "This is my string";
        String str2 = "This is my string";
        String str3 = new String("This is my string");
        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str.equals(str3));
        System.out.println(str.compareTo(str3)); //Сравнивает позиции

        String addString = str + str2;
        System.out.println(addString);
        System.out.println(str.concat(str2));
        String[] arr = new String[]{str, str2, str3};
        System.out.println(str.join(". ", arr)); //Слаживает строки с нужным отступом
        System.out.println(str.join(". ", str, str2, str3));

        String myBestString = "     This is string     ";
        System.out.println(myBestString.length());
        myBestString = myBestString.trim();
        System.out.println(myBestString.trim()); //Убирает пробелы перед и за текстом в строке
        System.out.println(myBestString.length());
        System.out.println(myBestString.charAt(5)); //Показывает букву в определенной позиции

        for (int i = 0; i < myBestString.length(); i++) {
            System.out.println(myBestString.charAt(i));
        }

        char[] charArr = myBestString.toCharArray();
        int count = 0;
        for (char ch : charArr) { //Символы или числом или 'i'
            if (ch == 'i') {
                count++;
            }
        }
        System.out.println("Count: " + count);
        System.out.println(myBestString.substring(5)); //Выводит число с определенной позиции
        System.out.println(myBestString.substring(5,8));

    }
}
