package by.tut.Homework.Lesson8;

public class UserPhone {
    public static void main(String[] args) {
        Phone phone = new Phone("Honor",8001169);
        Phone2 phone2 = new Phone2("Samsung",5353535,300);
        Phone3 phone3 = new Phone3("Nokia",4445665,210);
        System.out.println(phone.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println(phone3.getReceiveCall());
        System.out.println(phone);
    }
}
