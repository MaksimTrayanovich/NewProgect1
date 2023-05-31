package by.tut.Homework.Lesson17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentFinder {

    public static void main(String[] args) throws IOException {
        FileWriter my_file = new FileWriter("my_file.txt");
        String text = "+(29)8001169";
        String text2 = "1234-abc-5678-zxc-9q0e";
        my_file.write(text);
        my_file.write(text2);
        my_file.flush();
        FileReader myFile = new FileReader("my_file.txt");
        System.out.println(myFile);
        Pattern pattern = Pattern.compile("^\\+\\([0-9]{2}\\)\\d{7}$");
        Pattern pattern2 = Pattern.compile("\\d{4}\\-[a-z]{3}\\-\\d{4}\\-[a-z]{3}\\-\\d[a-z]\\d[a-z]");
        Matcher matcher2 = pattern2.matcher(text2);

        if (matcher2.find()){
            System.out.println(matcher2.group());
        }
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            System.out.println(matcher.group());
        }
        System.out.println("Phone numbers: " + matcher.matches());
//        Map<String, Document> my_file1 = new HashMap<>();
//        my_file1.put("my_file",Document);
//        System.out.println(my_file1);
    }
}