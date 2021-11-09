package game;

public class Board { // Creating an Array with every property

    Properties [] properties = new Properties[13];

    public Board()
    {
        properties[2] = new Properties(+250, "Tower", "You got the Tower, now make it Shower!");
        properties[3] = new Properties(-100, "Crater", "You fell in the Crater, Sorry, See you later.");
        properties[4] = new Properties(+100, "Palace Gates", "You arrived at the Palace Gates, now you feel like Bill Gates.");
        properties[5] = new Properties(-20, "Cold Desert", "You are stranded in the Cold Desert, now lost 20 in the Blizzard.");
        properties[6] = new Properties(+180, "Walled City", "You just arrived at Walled City, Splash some cash, go get Litty.");
        properties[7] = new Properties(0, "Monastery", "You arrived at the Monastery, nothing happened, its not that Scary.");
        properties[8] = new Properties(-70, "Black Cave", "You saw the Black Cave, go buy a plaster, you cut yourself when trying to Shave.");
        properties[9] = new Properties(+60, "Huts in the Mountain", "You arrived at the Huts in the Mountain, you found some money in the Fountain");
        properties[10] = new Properties(-80, "The Werewall", "You got to the werewolf wall, you heard a haul, you made a withdrawal, try again ;)!");
        properties[11] = new Properties(-50, "The Pit", "Oh Shit, You fell in the Pit.");
        properties[12] = new Properties(+650, "Goldmine", "Jackpot, You hit the Goldmine, now its Showtime.");
    }



}