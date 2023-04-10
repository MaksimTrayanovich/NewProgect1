package by.tut.Homework.Leson6;

import java.util.Scanner;

public class UserCard {
    public static void main(String[] args) {
        CreditCart mycart = new CreditCart();
        mycart.cartNumber = 2121;
        mycart.balance = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("putMoney");
        mycart.balance = mycart.balance + scanner.nextByte();
        if (mycart.balance <= 0) {
            System.out.println("Error");
        } else {
            System.out.println("Successful balance - " + mycart.balance);
        }
        if (mycart.balance>0){
            System.out.println("drawMoney");
            mycart.totalBalance = mycart.balance + scanner.nextByte();
            System.out.println("TotalBalance - " + mycart.totalBalance);
        }
        else {
            System.out.println("Error");
        }
        System.out.println("CartNumber - " + mycart.cartNumber);
    }
}
