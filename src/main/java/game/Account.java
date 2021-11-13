package game;

public class Account {
    public int amount;

    public Account(int a) {
        amount = a;
    }

    public String toString(){
        return("("+amount+")");  //This toString method returns amount as a String-variable
    }

    public int add(int amt) { //This method adds the new amount to the previous amount
        amount = amount + amt;
        System.out.println("Total Balance: " + amount);
        //add(amt);

        return amt;
    }
}
