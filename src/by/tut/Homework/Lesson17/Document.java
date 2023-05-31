package by.tut.Homework.Lesson17;

import java.util.Arrays;
import java.util.List;

public class Document {
    List<String> documents ;
    String phoneNumber ;
    String email ;

    public Document(List<String> documents, String phoneNumber, String email) {
        this.documents = documents;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public List<String> getDocuments() {
        return documents;
    }

    public void setDocuments(List<String> documents) {
        this.documents = documents;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
