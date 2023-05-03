package by.tut.Lesson12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterExample {
    public static void main(String[] args) {
        try (  FileWriter writer = new FileWriter("abc2.doc",true)){
            writer.write("this is my string\n");
            writer.flush();
            writer.write("this is my second string\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
