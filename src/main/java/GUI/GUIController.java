package GUI;
import java.awt.*;
import java.util.List;
import game.Board;
import game.Dice;
import game.Player;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class GUIController {

    private GUI_Player[] guiPlayers;
    private Dice dice = new Dice();
    private GUI gui;

    Board board;

    public GUIController(Board board) {
        this.board = board;
        this.gui = new GUI(board.BoardCreator());
    }

    public int getPlayerList() {
        return Integer.parseInt(gui.getUserButtonPressed("Choose number of players", "2", "3", "4"));
    }

    public String getPlayerName(int i) {
        String name = gui.getUserString("Enter the name of Player"+ (i + 1));
        return name;
    }

    public int setDice() {
        gui.getUserButtonPressed("Throw Dice", "Throw");
        gui.setDie(dice.getDice());
        dice.ThrowDice();
        return dice.getDice();
    }

    public void addPlayers(Player[] players) {
        this.guiPlayers = new GUI_Player[players.length];
        for (int i = 0; i < players.length; i++) {
            this.guiPlayers[i] = new GUI_Player(players[i].getPlayerName(), players[i].getAccount().getBalance());
            AddCar(0, i);
            gui.addPlayer(this.guiPlayers[i]);
        }
    }
    public void AddCar(int position, int player) { //Sætter en bil på brættet, når brugeren har indtastet navn
        board.getField(position).setCar(guiPlayers[player], true);
    }
    public void RemoveCar(int position2, int player2) {
        board.getField(position2).setCar(guiPlayers[player2], false);
    }

    public void setNewBalance(int player, int newBalance) {
        this.guiPlayers[player].setBalance(newBalance);
    }

    public void getWinnerMessage(List<String> message) {
        gui.showMessage(message.toString() + " WON!!");
    }

    public void showMessage(String message) {
        gui.displayChanceCard(message);
    }

}

