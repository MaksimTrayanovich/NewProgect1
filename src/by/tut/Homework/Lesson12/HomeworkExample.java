package by.tut.Homework.Lesson12;

import java.io.*;
import java.util.Scanner;

public class HomeworkExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name for reading");
        String filename = sc.next();
        if (!new File(filename).exists()) {
            throw new FileNotFoundException("File" + filename + "doesnt exist");
        }

        try (FileReader reader = new FileReader("abc2.doc");
             Scanner scanner = new Scanner(reader);
             FileWriter correctWriter = new FileWriter("results.doc");
             FileWriter incorrectWriter = new FileWriter("failed_result.doc")) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (isDocumentNameCorrect(line)) {
                    correctWriter.write(line + "\n");
                } else {
                    incorrectWriter.write(line +"is incorrect" +"\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isDocumentNameCorrect(String line) {
        return line.length() == 15 && (line.startsWith("docnum") || line.startsWith("contract"));
    }
}
