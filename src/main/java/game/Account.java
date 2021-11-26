package game;

public class Account {


    private int balance;

    public Account(int balance) {
        this.setBalance(balance);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

}