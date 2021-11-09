package game;

import gui_fields.*;
import gui_main.GUI;
import java.awt.*;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

public class GUIController {
    GUI_Field[] fields = new GUI_Field[12];
    GUI board;

    public GUIController() { // GUI Field creation

        fields[0] = new GUI_Street("Start", "Good Luck", "The person to hit 3000 first, wins", "+250", Color.RED, Color.BLACK);
        fields[1] = new GUI_Street("Tower", "+250", "You got the Tower, now make it Shower!", "+250", Color.darkGray, Color.BLACK);
        fields[2] = new GUI_Street("Crater", "-100", "You fell in the Crater, Sorry, See you later", "+250", Color.lightGray, Color.BLACK);
        fields[3] = new GUI_Street("Palace gates", "+100", "You arrived at the Palace Gates, now you feel like Bill Gates", "+250", Color.CYAN, Color.BLACK);
        fields[4] = new GUI_Street("Cold Desert", "-20", "You are stranded in the Cold Desert, now lost 20 in the Blizzard", "+250", Color.yellow, Color.BLACK);
        fields[5] = new GUI_Street("Walled city", "+180", "You just arrived at Walled City, Splash som cash, go get Litty", "+250", Color.blue, Color.BLACK);
        fields[6] = new GUI_Street("Monastery", "0", "You arrived at the Monastery, nothing happened, its not that Scary", "+250", Color.gray, Color.BLACK);
        fields[7] = new GUI_Street("Black Cave", "-70", "You saw the Black Cave, you cut yourself when trying to Shave", "+250", Color.black, Color.white);
        fields[8] = new GUI_Street("Huts in the mountain", "+60", "You arrived at the Huts in the Mountain, you found some money in the Fountain", "+250", Color.white, Color.BLACK);
        fields[9] = new GUI_Street("The Werewall", "-80", "You got to the werewolf wall, you heard a haul, you made a withdrawl, try again", "+250", Color.PINK, Color.BLACK);
        fields[10] = new GUI_Street("The pit", "-50", "Oh Shit, You fell in the Pit", "+250", Color.MAGENTA, Color.BLACK);
        fields[11] = new GUI_Street("Goldmine", "+650", "Jackpot, You hit the Goldmine, now its Showtime", "+250", Color.orange, Color.BLACK);

        board = new GUI(fields);

    }

    public void addPlayers(Player[] players) { // Creates the player in the GUI
        players[0].GUIplayer = new GUI_Player(players[0].PlayerName, players[0].bank.amount, new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.CAR, GUI_Car.Pattern.FILL));
        players[1].GUIplayer = new GUI_Player(players[1].PlayerName, players[1].bank.amount, new GUI_Car(Color.BLUE, Color.BLUE, GUI_Car.Type.CAR, GUI_Car.Pattern.FILL));
        board.addPlayer(players[0].GUIplayer);
        board.addPlayer(players[1].GUIplayer);
    }

    public void MoveCar(Player player, int fieldId) { // Makes the players/cars movable in GUI
        fields[player.currentField].setCar(player.GUIplayer, false);
        fields[fieldId].setCar(player.GUIplayer, true);
        player.currentField = fieldId;
    }

    public void GUIBalance(Player player){ // updates the balance for the players after each dice throw in GUI
        player.GUIplayer.setBalance(player.bank.amount);
    }


    public void GUIDice(Cup cup){ // creates two dice in GUI
        board.setDice(cup.dice1.getFaceValue(), cup.dice2.getFaceValue());

    }

    public String GUIName(){ // Makes a Insert your name button in GUI
        return board.getUserString("Insert your name");
    }






}
