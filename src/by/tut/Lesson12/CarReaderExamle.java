package by.tut.Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarReaderExamle {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("car.doc");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            while (true) {
                Car myCar = (Car) objectInputStream.readObject();
                System.out.println(myCar);
            }
//            System.out.println(objectInputStream.readObject());
        } catch (IOException e) {
          //  throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
