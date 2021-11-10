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

        fields[1] = new GUI_Street(+2, "Go!", "You got the Tower, now make it Shower!", "");
        fields[2] = new GUI_Street(0, "Chance", "You got the Tower, now make it Shower!", "");
        fields[3] = new GUI_Street(+1, "Balloon Stand", "You got the Tower, now make it Shower!", "");
        fields[4] = new GUI_Street(+1, "Cotton Candy", "You fell in the Crater, Sorry, See you later.", "");
        fields[5] = new GUI_Street(+100, "Chance", "You arrived at the Palace Gates, now you feel like Bill Gates.", "");
        fields[6] = new GUI_Street(-20, "Yellow Line Railroad", "You are stranded in the Cold Desert, now lost 20 in the Blizzard.", "");
        fields[7] = new GUI_Street(+180, "Puppet Show", "You just arrived at Walled City, Splash some cash, go get Litty.", "");
        fields[8] = new GUI_Street(0, "Magic Show", "You arrived at the Monastery, nothing happened, its not that Scary.", "");
        fields[9] = new GUI_Street(-70, "Pay $2 to see the fireworks", "You saw the Black Cave, go buy a plaster, you cut yourself when trying to Shave.", "");
        fields[10] = new GUI_Street(+60, "Chance", "You arrived at the Huts in the Mountain, you found some money in the Fountain", "");
        fields[11] = new GUI_Street(-80, "Rest Rooms", "You got to the werewolf wall, you heard a haul, you made a withdrawal, try again ;)!", "");
        fields[12] = new GUI_Street(-50, "Merry-Go-Round", "Oh Shit, You fell in the Pit.", "");
        fields[13] = new GUI_Street(+650, "Paddle Boats", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[14] = new GUI_Street(+650, "Green Line Railroad", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[15] = new GUI_Street(+650, "Water Slide", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[16] = new GUI_Street(+650, "Miniature Golf", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[17] = new GUI_Street(+650, "Uncle Pennybag's Loose Change", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[18] = new GUI_Street(+650, "Chance", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[19] = new GUI_Street(+650, "Video Arcade", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[20] = new GUI_Street(+650, "Haunted House", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[21] = new GUI_Street(+650, "Chance", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[22] = new GUI_Street(+650, "Blue Line Railroad", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[23] = new GUI_Street(+650, "Helicopter Ride", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[24] = new GUI_Street(+650, "Pony Ride", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[25] = new GUI_Street(+650, "Pay $2 to see the water show", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[26] = new GUI_Street(+650, "Chance", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[27] = new GUI_Street(+650, "Pay $3 To Take The Tramway To The Rest Rooms", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[28] = new GUI_Street(+650, "Bumper Cars", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[29] = new GUI_Street(+650, "Ferris Wheel", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[30] = new GUI_Street(+650, "Red Line Railroad", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[31] = new GUI_Street(+650, "Loop The Loop", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        fields[32] = new GUI_Street(+650, "Roller Coaster", "s","s");

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
