package game;

import java.util.Scanner;

public class Language {

    static Scanner sc = new Scanner(System.in);
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_CYAN = "\u001B[36m";

    public static void Intro(Player player1, Player player2) {
        System.out.println("Welcome " + player1 + " and " + player2 + " to Matador!");
        System.out.println("The first player to get 3000, wins. Good luck!");

    }

    public static void PlayerRoll(Player player) {
        System.out.println("\n"+player.PlayerName+"press OK on the keyboard if you want to roll");

    }

    public static void PlayerRolled(Player player, Cup cup){
        System.out.println(player + " rolled " + cup.sum());

    }

    public static void Arrived(String name, String description, int outcome, Bank bank){
        // Using the constructor from properties class to add the outcome of the dice throw with the system.out.println

        System.out.println("You landed on: "+name);
        System.out.println(description);
        System.out.println("The effect on your bank-account: "+ outcome);
        if (bank.amount < 0) {
            bank.amount = 0;
            System.out.println("\n"+TEXT_RED +"Your bank balance is now: " + bank.amount+ TEXT_RESET);
        }
        else {
            System.out.println("\n" + TEXT_RED + "Your bank balance is now: " + bank.amount + TEXT_RESET);
        }
    }

    public static void PlayerWon(Player player) {
        System.out.println("\n"+player.PlayerName+TEXT_CYAN+" WON!"+TEXT_RESET);
    }

}