package by.tut.Homework.Leson6;

public class CreditCart {
    public int cartNumber = 2121;
    public int balance = 0;

    public int totalBalance;

    public CreditCart() {
    }

    public CreditCart(int cartNumber, int balance, int totalBalance) {
        this.cartNumber = cartNumber;
        this.balance = balance;
        this.totalBalance = totalBalance;
    }

    public int getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(int cartNumber) {
        this.cartNumber = cartNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(int totalBalance) {
        this.totalBalance = totalBalance;
    }

    public void checkBalance() {
        System.out.println("balance" + balance);
    }

    public void putMoney() {
        System.out.println("putMoney");
    }

    public void drawMoney() {
        System.out.println("drawMoney");
    }

    @Override
    public String toString() {
        return "CreditCart{" +
                "cartNumber=" + cartNumber +
                ", balance=" + balance +
                ", totalBalance=" + totalBalance +
                '}';
    }

    public void changeBalance(int changeBalance) {
        totalBalance = changeBalance + totalBalance;
        if (totalBalance <= 0) {
            System.out.println("Error");
        } else {
            System.out.println("Successful " + totalBalance);
        }
    }
}