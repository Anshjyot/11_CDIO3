package game;

import gui_fields.GUI_Player;

public class Player {

    String playerName;
    GUI_Player guiplayer;
    Account bank;
    int currentField = 0;

    public Player(String playerName) {// Create constructor, returns nothing
        this.playerName= playerName;
        bank  = new Account(35);
    }

    public String setPlayerName(String PlayerName) {// This will be used to get the PlayerName
        this.playerName = PlayerName;
        return PlayerName;
    }
    //Used to get Playername
    public String toString (){

        return playerName;
    }
    // Used to get bank value
    public Account getBank(){

        return bank;
    }

}