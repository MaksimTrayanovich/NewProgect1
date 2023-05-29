package by.tut.Lesson18;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlReader {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Student.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Student myStudent = (Student)unmarshaller.unmarshal(new File("Student.xml"));
        System.out.println(myStudent);
    }
}