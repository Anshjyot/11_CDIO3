package game;

public class Board { // Creating an Array with every property

    Square [] properties = new Square[32];

    public Board(Player[] players, GUIController controller)
    {
        properties[0] = new Properties(+2, "Go!", "You got the Tower, now make it Shower!", "");
        properties[1] = new Chance( "Chance", players, controller);
        properties[2] = new Properties(+1, "Balloon Stand", "You got the Tower, now make it Shower!", "");
        properties[3] = new Properties(+1, "Cotton Candy", "You fell in the Crater, Sorry, See you later.", "");
        properties[4] = new Chance( "Chance", players, controller);
        properties[5] = new Properties(-20, "Yellow Line Railroad", "You are stranded in the Cold Desert, now lost 20 in the Blizzard.", "");
        properties[6] = new Properties(+180, "Puppet Show", "You just arrived at Walled City, Splash some cash, go get Litty.", "");
        properties[7] = new Properties(0, "Magic Show", "You arrived at the Monastery, nothing happened, its not that Scary.", "");
        properties[8] = new Properties(-70, "Pay $2 to see the fireworks", "You saw the Black Cave, go buy a plaster, you cut yourself when trying to Shave.", "");
        properties[9] = new Chance( "Chance", players, controller);
        properties[10] = new Properties(-80, "Rest Rooms", "You got to the werewolf wall, you heard a haul, you made a withdrawal, try again ;)!", "");
        properties[11] = new Properties(-50, "Merry-Go-Round", "Oh Shit, You fell in the Pit.", "");
        properties[12] = new Properties(+650, "Paddle Boats", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[13] = new Properties(+650, "Green Line Railroad", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[14] = new Properties(+650, "Water Slide", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[15] = new Properties(+650, "Miniature Golf", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[16] = new Properties(+650, "Uncle Pennybag's Loose Change", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[17] = new Chance( "Chance", players, controller);
        properties[18] = new Properties(+650, "Video Arcade", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[19] = new Properties(+650, "Haunted House", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[20] = new Chance( "Chance", players, controller);
        properties[21] = new Properties(+650, "Blue Line Railroad", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[22] = new Properties(+650, "Helicopter Ride", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[23] = new Properties(+650, "Pony Ride", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[24] = new Properties(+650, "Pay $2 to see the water show", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[25] = new Properties(+650, "Chance", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[26] = new Properties(+650, "Pay $3 To Take The Tramway To The Rest Rooms", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[27] = new Properties(+650, "Bumper Cars", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[28] = new Properties(+650, "Ferris Wheel", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[29] = new Properties(+650, "Red Line Railroad", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[30] = new Properties(+650, "Loop The Loop", "Jackpot, You hit the Goldmine, now its Showtime.", "");
        properties[31] = new Properties(+650, "Roller Coaster", "Jackpot, You hit the Goldmine, now its Showtime.", "");
    }

}