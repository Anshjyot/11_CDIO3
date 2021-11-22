package game;

import gui_fields.*;
import gui_main.GUI;
import java.awt.*;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

public class GUIController {
    GUI_Field[] fields = new GUI_Field[32];
    GUI board;
    GUI_Player[] players;

    public GUIController() { // GUI Field creation

        fields[0] = new GUI_Street( "Go!", "You got the Tower, now make it Shower!","", "+82",Color.BLACK, Color.PINK);
        fields[1] = new GUI_Street("Chance", "You got the Tower, now make it Shower!","", "+82",Color.BLACK, Color.YELLOW);
        fields[2] = new GUI_Street("Balloon Stand","You got the Tower, now make it Shower!","", "+82",Color.magenta, Color.BLACK);
        fields[3] = new GUI_Street("Cotton Candy", "You got the Tower, now make it Shower!","", "+82",Color.magenta, Color.BLACK);
        fields[4] = new GUI_Street("Chance", "You got the Tower, now make it Shower!","", "+82",Color.BLACK, Color.YELLOW);
        fields[5] = new GUI_Street("Yellow Line Railroad", "You got the Tower, now make it Shower!","", "+82",Color.WHITE, Color.YELLOW);
        fields[6] = new GUI_Street("Puppet Show", "You got the Tower, now make it Shower!","", "+82",Color.cyan, Color.BLACK);
        fields[7] = new GUI_Street("Magic Show", "You got the Tower, now make it Shower!","", "+82",Color.cyan, Color.black);
        fields[8] = new GUI_Street("Pay $2 to see the fireworks", "You got the Tower, now make it Shower!","", "+82",Color.white, Color.BLACK);
        fields[9] = new GUI_Street("Chance", "You got the Tower, now make it Shower!","", "+82",Color.BLACK, Color.YELLOW);
        fields[10] = new GUI_Street("Rest Rooms", "You got the Tower, now make it Shower!","", "+82",Color.MAGENTA, Color.BLACK);
        fields[11] = new GUI_Street("Merry-Go-Round", "You got the Tower, now make it Shower!","", "+82",Color.PINK, Color.BLACK);
        fields[12] = new GUI_Street("Paddle Boats", "You got the Tower, now make it Shower!","", "+82",Color.PINK, Color.BLACK);
        fields[13] = new GUI_Street("Green Line Railroad", "You got the Tower, now make it Shower!","", "+82",Color.WHITE, Color.GREEN);
        fields[14] = new GUI_Street("Water Slide", "You got the Tower, now make it Shower!","", "+82",Color.orange, Color.BLACK);
        fields[15] = new GUI_Street("Miniature Golf", "Welcome", "", "+82",Color.orange, Color.BLACK);
        fields[16] = new GUI_Street("Uncle Pennybag's Loose Change", "You got the Tower, now make it Shower!","", "+82",Color.white, Color.BLACK);
        fields[17] = new GUI_Street("Chance", "You got the Tower, now make it Shower!","", "+82",Color.BLACK, Color.YELLOW);
        fields[18] = new GUI_Street("Video Arcade", "You got the Tower, now make it Shower!","", "+82",Color.RED, Color.BLACK);
        fields[19] = new GUI_Street("Haunted House", "You got the Tower, now make it Shower!","", "+82",Color.RED, Color.BLACK);
        fields[20] = new GUI_Street("Chance", "You got the Tower, now make it Shower!","", "+82",Color.BLACK, Color.YELLOW);
        fields[21] = new GUI_Street("Blue Line Railroad", "You got the Tower, now make it Shower!","", "+82",Color.WHITE, Color.BLUE);
        fields[22] = new GUI_Street("Helicopter Ride", "You got the Tower, now make it Shower!","", "+82",Color.YELLOW, Color.BLACK);
        fields[23] = new GUI_Street("Pony Ride","You got the Tower, now make it Shower!","", "+82",Color.YELLOW, Color.BLACK);
        fields[24] = new GUI_Street("Pay $2 to see the water show", "You got the Tower, now make it Shower!","", "+82",Color.WHITE, Color.BLACK);
        fields[25] = new GUI_Street("Chance", "You got the Tower, now make it Shower!","", "+82",Color.BLACK, Color.YELLOW);
        fields[26] = new GUI_Street("Restrooms","Pay $3 To Take The Tramway To The Rest Rooms","You got the Tower, now make it Shower!","+82",Color.WHITE, Color.BLACK);
        fields[27] = new GUI_Street("Bumper Cars","You got the Tower, now make it Shower!","", "+82",Color.GREEN, Color.BLACK);
        fields[28] = new GUI_Street("Ferris Wheel", "You got the Tower, now make it Shower!","", "+82",Color.GREEN, Color.BLACK);
        fields[29] = new GUI_Street("Red Line Railroad", "You got the Tower, now make it Shower!","", "+82",Color.WHITE, Color.RED);
        fields[30] = new GUI_Street("Loop The Loop", "You got the Tower, now make it Shower!","", "+82",Color.BLUE, Color.BLACK);
        fields[31] = new GUI_Street("Roller Coaster","You got the Tower, now make it Shower!","", "+82",Color.BLUE, Color.BLACK);
        board = new GUI(fields, Color.GRAY);

    }
/*
    public void addPlayers(Player[] players) { // Creates the player in the GUI
        players[0].guiplayer = new GUI_Player(players[0].playerName, players[0].bank.amount, new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.CAR, GUI_Car.Pattern.FILL));
        players[1].guiplayer = new GUI_Player(players[1].playerName, players[1].bank.amount, new GUI_Car(Color.BLUE, Color.BLUE, GUI_Car.Type.CAR, GUI_Car.Pattern.FILL));
        board.addPlayer(players[0].guiplayer);
        board.addPlayer(players[1].guiplayer);

    }
    */

    public void MoveCar(Player player, int fieldId) { // Makes the players/cars movable in GUI
        fields[player.currentField].setCar(player.guiplayer, false);
        player.currentField = (player.currentField + fieldId) % fields.length;
        fields[player.currentField].setCar(player.guiplayer, true);
        
    }

    public void GUIBalance(Player player){ // updates the balance for the players after each dice throw in GUI
        player.guiplayer.setBalance(player.bank.amount);
    }


    public void GUIDice(Cup cup){ // creates two dice in GUI
        board.setDice(cup.dice1.getFaceValue(), cup.dice2.getFaceValue());

    }
    public String GUIName(){ // Makes a Insert your name button in GUI
        return board.getUserString("Insert your name");
    }

   //Creates a min and a max for players
    public int getIntegerInput(String msg, int min, int max) {

        String response = board.getUserButtonPressed( msg,
                "2 Players",
                "3 Players", "4 Players"
        );
        if(response.equals("2 Players")) {
            return 2;
        } else if(response.equals("3 Players")) {
            return 3;
        } else {
            return 4;
        }


        //return board.getUserInteger(msg,min,max);
    }

    public String getStringInput (String msg) {return board.getUserString(msg); }
    public void createPlayer (java.util.List<Player> playerList){
        players = new GUI_Player[playerList.size()];
        for (int i = 0; i < playerList.size(); i++) {
            players[i] = new GUI_Player(playerList.get(i).playerName);
            board.addPlayer(players[i]);
            playerList.get(i).guiplayer = players[i];
        }

    }
}
