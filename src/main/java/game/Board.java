package game;

public class Board { // Creating an Array with every property

    Square [] properties = new Square[32];

    public Board(Player[] players, GUIController controller)
    {
        properties[0] = new Properties(+2, "You got the Tower, now make it Shower!", "");
        properties[1] = new Chance( "Chance", players, controller);
        properties[2] = new Properties(+1, "You got the Tower, now make it Shower!", "");
        properties[3] = new Properties(+1, "You fell in the Crater, Sorry, See you later.", "");
        properties[4] = new Chance( "Chance", players, controller);
        properties[5] = new Properties(-20, "You are stranded in the Cold Desert, now lost 20 in the Blizzard.", "");
        properties[6] = new Properties(+180, "You just arrived at Walled City, Splash some cash, go get Litty.", "");
        properties[7] = new Properties(0, "You arrived at the Monastery, nothing happened, its not that Scary.", "");
        properties[8] = new Properties(-70, "You saw the Black Cave, go buy a plaster, you cut yourself when trying to Shave.", "");
        properties[9] = new Chance( "Chance", players, controller);
        properties[10] = new Properties(-80, "You got to the werewolf wall, you heard a haul, you made a withdrawal, try again ;)!", "");
        properties[11] = new Properties(-50, "Oh Shit, You fell in the Pit.", "");
        properties[12] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[13] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[14] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[15] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[16] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[17] = new Chance( "Chance", players, controller);
        properties[18] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[19] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[20] = new Chance( "Chance", players, controller);
        properties[21] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[22] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[23] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[24] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[25] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[26] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[27] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[28] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[29] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[30] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[31] = new Properties(+650, "Jackpot, You hit the Goldmine, now its Showtime.", "");
    }

}