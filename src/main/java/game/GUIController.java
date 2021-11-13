package game;

import gui_fields.*;
import gui_main.GUI;
import java.awt.*;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

public class GUIController {
    GUI_Field[] fields = new GUI_Field[32];
    GUI board;

    public GUIController() { // GUI Field creation

        fields[0] = new GUI_Street( "Go!", "You got the Tower, now make it Shower!","", "+82",Color.RED, Color.BLACK);
        fields[1] = new GUI_Street("Chance", "You got the Tower, now make it Shower!","", "+82",Color.darkGray, Color.BLACK);
        fields[2] = new GUI_Street("Balloon Stand","You got the Tower, now make it Shower!","", "+82",Color.lightGray, Color.BLACK);
        fields[3] = new GUI_Street("Cotton Candy", "You got the Tower, now make it Shower!","", "+82",Color.CYAN, Color.BLACK);
        fields[4] = new GUI_Street("Chance", "You got the Tower, now make it Shower!","", "+82",Color.yellow, Color.BLACK);
        fields[5] = new GUI_Street("Yellow Line Railroad", "You got the Tower, now make it Shower!","", "+82",Color.blue, Color.BLACK);
        fields[6] = new GUI_Street("Puppet Show", "You got the Tower, now make it Shower!","", "+82",Color.gray, Color.BLACK);
        fields[7] = new GUI_Street("Magic Show", "You got the Tower, now make it Shower!","", "+82",Color.black, Color.white);
        fields[8] = new GUI_Street("Pay $2 to see the fireworks", "You got the Tower, now make it Shower!","", "+82",Color.white, Color.BLACK);
        fields[9] = new GUI_Street("Chance", "You got the Tower, now make it Shower!","", "+82",Color.PINK, Color.BLACK);
        fields[10] = new GUI_Street("Rest Rooms", "You got the Tower, now make it Shower!","", "+82",Color.MAGENTA, Color.BLACK);
        fields[11] = new GUI_Street("Merry-Go-Round", "You got the Tower, now make it Shower!","", "+82",Color.orange, Color.BLACK);
        fields[12] = new GUI_Street("Paddle Boats", "You got the Tower, now make it Shower!","", "+82",Color.RED, Color.BLACK);
        fields[13] = new GUI_Street("Green Line Railroad", "You got the Tower, now make it Shower!","", "+82",Color.yellow, Color.BLACK);
        fields[14] = new GUI_Street("Water Slide", "You got the Tower, now make it Shower!","", "+82",Color.darkGray, Color.BLACK);
        fields[15] = new GUI_Street("Uncle Pennybag's Loose Change", "You got the Tower, now make it Shower!","", "+82",Color.white, Color.BLACK);
        fields[16] = new GUI_Street("Chance", "You got the Tower, now make it Shower!","", "+82",Color.blue, Color.BLACK);
        fields[17] = new GUI_Street("Video Arcade", "You got the Tower, now make it Shower!","", "+82",Color.RED, Color.BLACK);
        fields[18] = new GUI_Street("Haunted House", "You got the Tower, now make it Shower!","", "+82",Color.magenta, Color.BLACK);
        fields[19] = new GUI_Street("Chance", "You got the Tower, now make it Shower!","", "+82",Color.cyan, Color.BLACK);
        fields[20] = new GUI_Street("Blue Line Railroad", "You got the Tower, now make it Shower!","", "+82",Color.lightGray, Color.BLACK);
        fields[21] = new GUI_Street("Helicopter Ride", "You got the Tower, now make it Shower!","", "+82",Color.GREEN, Color.BLACK);
        fields[22] = new GUI_Street("Pony Ride","You got the Tower, now make it Shower!","", "+82",Color.getHSBColor(223,44,11), Color.BLACK);
        fields[23] = new GUI_Street("Pay $2 to see the water show", "You got the Tower, now make it Shower!","", "+82",Color.getHSBColor(3,88,77), Color.BLACK);
        fields[24] = new GUI_Street("Chance", "You got the Tower, now make it Shower!","", "+82",Color.getHSBColor(100,100,100), Color.BLACK);
        fields[25] = new GUI_Street("Pay $3 To Take The Tramway To The Rest Rooms","You got the Tower, now make it Shower!","", "+82",Color.RED, Color.BLACK);
        fields[26] = new GUI_Street("Bumper Cars","You got the Tower, now make it Shower!","", "+82",Color.getHSBColor(122,12,21), Color.BLACK);
        fields[27] = new GUI_Street("Ferris Wheel", "You got the Tower, now make it Shower!","", "+82",Color.getHSBColor(245,145,140), Color.BLACK);
        fields[28] = new GUI_Street("Red Line Railroad", "You got the Tower, now make it Shower!","", "+82",Color.getHSBColor(221,90,9), Color.BLACK);
        fields[29] = new GUI_Street("Loop The Loop", "You got the Tower, now make it Shower!","", "+82",Color.getHSBColor(200,200,200), Color.BLACK);
        fields[30] = new GUI_Street("Roller Coaster","You got the Tower, now make it Shower!","", "+82",Color.getHSBColor(233,88,11), Color.BLACK);
        fields[31] = new GUI_Street("KARL","You got the Tower, now make it Shower!","", "+82",Color.getHSBColor(199,133,208), Color.BLACK);
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
