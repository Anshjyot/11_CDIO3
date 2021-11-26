package controller;

import GUI.GUIController;
import game.Board;
import game.Chance;
import game.Player;

import java.util.*;
import java.util.List;

public class JuniorMonopolyController {

    private final int StartField = 0;
    private GUIController guiController;
    private Player[] players;
    private int startBalance;
    private boolean noWinner = true;
    Chance ChanceCard = new Chance();
    Board board = new Board();


    public void playGame() {
        this.guiController = new GUIController(board);
        NumberOfPlayers();
        gameLoop();
    }

    private void gameLoop() {
        while (noWinner) {
            for (int i = 0; i < players.length; i++) {
                int faceValue = guiController.setDice();

                guiController.RemoveCar(players[i].getPosition(), i);

                if (players[i].getPosition() + faceValue > 31) {
                    StartField(i);
                    players[i].setPosition(players[i].getPosition() + faceValue - 32);

                } else {
                    players[i].setPosition(players[i].getPosition() + faceValue);
                }

                guiController.AddCar(players[i].getPosition(), i);
                FieldOutcome(i);
                guiController.setNewBalance(i, players[i].getAccount().getBalance());

                Winner(i);
            }
        }
    }

    private void Winner(int player) {
        int winnerBalance = 0;
        List<String> winnerName = new ArrayList<String>();

        if (players[player].getAccount().getBalance() < 0) {
            noWinner = false;
            for (int i = 0; i < players.length; i++) {
                if (players[i].getAccount().getBalance() > winnerBalance) {
                    winnerName.clear();
                    winnerName.add(players[i].getPlayerName());
                    winnerBalance = players[i].getAccount().getBalance();

                } else if (players[i].getAccount().getBalance() == winnerBalance) {
                    winnerName.add(players[i].getPlayerName());
                    winnerBalance = players[i].getAccount().getBalance();
                }
            }
            guiController.getWinnerMessage(winnerName);
            System.exit(0);
        }
    }

    private void NumberOfPlayers() {
        int playerList = guiController.getPlayerList();

        if (playerList == 2) {
            startBalance = 50;
        }
        if (playerList == 3) {
            startBalance = 50;
        }
        if (playerList == 4) {
            startBalance = 50;
        }

        this.players = new Player[playerList];

        for (int i = 0; i < this.players.length; i++) {
            String name = guiController.getPlayerName(i);
            this.players[i] = new Player(name, startBalance, StartField);
        }
        guiController.addPlayers(players);
        ChanceCard.CreateChanceCard();
    }

    private void FieldOutcome(int i) {

        switch (players[i].getPosition() + 1) {

            case 1: // Our Start-Field
                break;
            case 2: // CHANCE FIELD
                landOnChanceCard(i);
                break;
            case 3:
                landOnField(i, -1);
                break;
            case 4:
                landOnField(i, -1);
                break;
            case 5: // CHANCE FIELD
                landOnChanceCard(i);
                break;
            case 6:
                landOnField(i, -1);
                break;
            case 7://
                landOnField(i, -2);
                break;
            case 8:
                guiController.showMessage("JAIL VISIT");
                break;
            case 9:
                landOnField(i, -2);
                break;
            case 10: // CHANCE FIELD
                landOnChanceCard(i);
                break;
            case 11:
                landOnField(i, -2);
                break;
            case 12:
                landOnField(i, -2);
                break;
            case 13:
                landOnField(i, -2);
                break;
            case 14:
                landOnField(i, -3);
                break;
            case 15:
                landOnField(i, -3);
                break;
            case 16:
                landOnField(i, -3);
                break;
            case 17:
                landOnField(i, -3);
                break;
            case 18: // CHANCE FIELD
                landOnChanceCard(i);
                break;
            case 19:
                landOnField(i, -4);
                break;
            case 20:
                landOnField(i, -4);
                break;
            case 21:  // CHANCE FIELD
                landOnChanceCard(i);
                break;
            case 22:
                landOnField(i, -4);
                break;
            case 23:
                landOnField(i, -5);
                break;
            case 24:
                landOnField(i, -4);
                break;
            case 25:
                guiController.showMessage("JAIL TIME");
                guiController.RemoveCar(players[i].getPosition(), i);
                players[i].setPosition(players[i].getPosition() - 16);
                guiController.AddCar(players[i].getPosition(), i);
                break;
            case 26:
                landOnChanceCard(i);
                break;
            case 27:
                landOnField(i, -3);
                break;
            case 28:
                landOnField(i, -1);
                break;
            case 29:
                landOnField(i, -2);
                break;
            case 30:
                landOnField(i, -2);
                break;
            case 31:
                landOnField(i, -1);
                break;
            case 32:
                landOnField(i, -1);
                break;
        }
    }

    private void landOnField(int i, int FieldOutcome) {
        players[i].getAccount().setBalance(players[i].getAccount().getBalance() + FieldOutcome);
    }
    private void StartField(int i) {
        players[i].getAccount().setBalance(players[i].getAccount().getBalance() + 2);
    }


    private void landOnChanceCard(int i) {

        Chance ChanceCardOutcome = ChanceCard.getChanceCard();
        landOnField(i, ChanceCardOutcome.getAmount());
        guiController.RemoveCar(players[i].getPosition(), i);

        if (ChanceCardOutcome.getValue() == 2 || ChanceCardOutcome.getValue() == 1 || ChanceCardOutcome.getValue() == 5) {
            players[i].setPosition(ChanceCardOutcome.getField());
        } else {
            players[i].setPosition(players[i].getPosition() + ChanceCardOutcome.getField());
        }
        if (ChanceCardOutcome.getValue() == 2 || ChanceCardOutcome.getValue() == 3) {
            FieldOutcome(i);
        }

        guiController.AddCar(players[i].getPosition(), i);
        guiController.showMessage(ChanceCardOutcome.getTextMessage());
    }
}
