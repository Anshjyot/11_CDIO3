package controller;

import GUI.GUIController;
import game.Board;
import game.Player;

import java.util.*;
import java.util.List;

public class JuniorMonopolyController {

    private final int StartField = 0;
    private GUIController guiController = new GUIController();
    private int startBalance;
    private boolean noWinner = true;
    List<Player> players = new ArrayList<>();
    Board board;


    public void playGame() {
        board = new Board(players, guiController);
        this.guiController.initializeBoard(board);
        NumberOfPlayers();
        gameLoop();
    }

    private void gameLoop() {
        while (noWinner) {
            for (int i = 0; i < players.size(); i++) {
                int faceValue = guiController.setDice();

                guiController.RemoveCar(players.get(i).getPosition(), i);

                if (players.get(i).getPosition() + faceValue > 31) {
                    StartField(i);
                    players.get(i).setPosition(players.get(i).getPosition() + faceValue - 32);

                } else {
                    players.get(i).setPosition(players.get(i).getPosition() + faceValue);
                }

                guiController.AddCar(players.get(i).getPosition(), i);
                FieldOutcome(i);

                for (Player player: players) {
                    guiController.setNewBalance(player.getIndex(), player.getAccount().getBalance());
                }

                Winner(i);
            }
        }
    }

    private void Winner(int player) {
        int loserBalance = 0;
        List<String> winnerName = new ArrayList<String>();

        if (players.get(player).getAccount().getBalance() < 0) {
            for (int i = 0; i < players.size(); i++) {
                if (players.get(i).getAccount().getBalance() > loserBalance) {
                    winnerName.add(players.get(i).getPlayerName());

                }
            }

            if (winnerName.size() == 1) {
                guiController.getWinnerMessage(winnerName);
                System.exit(0);
            }

        }
    }

    private void NumberOfPlayers() {
        int playerList = guiController.getPlayerList();

        if (playerList == 2) {
            startBalance = 35;
        }
        if (playerList == 3) {
            startBalance = 35;
        }
        if (playerList == 4) {
            startBalance = 35;
        }


        for (int i = 0; i < playerList; i++) {
            String name = guiController.getPlayerName(i);
            players.add(new Player(name, startBalance, StartField, i));
        }
        guiController.addPlayers(players);
    }

    private void FieldOutcome(int i) {
        board.getSquare(players.get(i).getPosition()).Arrived(players.get(i));


    }

    private void landOnField(int i, int FieldOutcome) {
        players.get(i).getAccount().setBalance(players.get(i).getAccount().getBalance() + FieldOutcome);
    }
    private void StartField(int i) {
        players.get(i).getAccount().setBalance(players.get(i).getAccount().getBalance() + 2);
    }


}
