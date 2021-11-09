package game;

import gui_fields.GUI_Player;

public class Player {

    String PlayerName;
    GUI_Player GUIplayer;
    Bank bank;
    int currentField = 0;

    public Player() {// Create constructor, returns nothing
        bank  = new Bank(1000);
    }

    public String setPlayerName(String PlayerName) {// This will be used to get the PlayerName
        this.PlayerName = PlayerName;
        return PlayerName;
    }
    //Used to get Playername
    public String toString (){

        return PlayerName;
    }
    // Used to get bank value
    public Bank getBank(){

        return bank;
    }

}