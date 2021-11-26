package game;

import java.awt.Color;

import gui_fields.*;
import gui_main.GUI;

public class Board {
    GUI_Field[] fields = new GUI_Field[32];
    GUI board;

    public GUI_Field getField(int i) {
        return fields[i];

    }

    public GUI_Field[] BoardCreator() {

        fields[0] = new GUI_Start("START", "You got the Tower, now make it Shower!", "+82",Color.getHSBColor(153,232,179), Color.PINK);
        fields[1] = new GUI_Chance("?", "","",Color.BLACK, Color.YELLOW);
        fields[2] = new GUI_Street("Balloon Stand","Price: $1","", "+82",Color.magenta, Color.BLACK);
        fields[3] = new GUI_Street("Cotton Candy", "Price: $1","", "+82",Color.magenta, Color.BLACK);
        fields[4] = new GUI_Chance("?", "","",Color.BLACK, Color.YELLOW);
        fields[5] = new GUI_Street("Yellow Line Railroad", "Price: $1","", "+82",Color.WHITE, Color.ORANGE);
        fields[6] = new GUI_Street("Puppet Show", "Price: $1","", "+82",Color.cyan, Color.BLACK);
        fields[7] = new GUI_Street("Magic Show", "Price: $2","", "+82",Color.cyan, Color.black);

        fields[8] = new GUI_Jail();
        fields[8].setSubText("JAIL VISIT");
        fields[8].setDescription("Jail visit");

        fields[9] = new GUI_Chance("?", "","",Color.BLACK, Color.YELLOW);
        fields[10] = new GUI_Street("Rest Rooms", "Price: $2","", "+82",Color.BLACK, Color.WHITE);
        fields[11] = new GUI_Street("Merry-Go-Round", "Price: $2","", "+82",Color.PINK, Color.BLACK);
        fields[12] = new GUI_Street("Paddle Boats", "Price: $2","", "+82",Color.PINK, Color.BLACK);
        fields[13] = new GUI_Street("Green Line Railroad", "Price: $2","", "+82",Color.WHITE, Color.GREEN);
        fields[14] = new GUI_Street("Water Slide", "Price: $3","", "+82",Color.orange, Color.BLACK);
        fields[15] = new GUI_Street("Miniature Golf", "Price: $3", "", "+82",Color.orange, Color.BLACK);
        fields[16] = new GUI_Street("Uncle Pennybag's Loose Change", "Price: $4","", "+82",Color.white, Color.BLACK);
        fields[17] = new GUI_Chance("?", "","",Color.BLACK, Color.YELLOW);
        fields[18] = new GUI_Street("Video Arcade", "Price: $4","", "+82",Color.RED, Color.BLACK);
        fields[19] = new GUI_Street("Haunted House", "Price: $4","", "+82",Color.RED, Color.BLACK);
        fields[20] = new GUI_Chance("?", "","",Color.BLACK, Color.YELLOW);
        fields[21] = new GUI_Street("Blue Line Railroad", "Price: $4","", "+82",Color.WHITE, Color.BLUE);
        fields[22] = new GUI_Street("Helicopter Ride", "Price: $5!","", "+82",Color.YELLOW, Color.BLACK);
        fields[23] = new GUI_Street("Pony Ride","Price: $4","", "+82",Color.YELLOW, Color.BLACK);

        fields[24] = new GUI_Jail();
        fields[24].setSubText("JAIL");
        fields[24].setDescription("Locked up");

        fields[25] = new GUI_Chance("?", "","",Color.BLACK, Color.YELLOW);
        fields[26] = new GUI_Street("Go to Rest rooms","Price: $3","You got the Tower, now make it Shower!","+82",Color.WHITE, Color.BLACK);
        fields[27] = new GUI_Street("Bumper Cars","Price: $1","", "+82",Color.GREEN, Color.BLACK);
        fields[28] = new GUI_Street("Ferris Wheel", "Price: $2","", "+82",Color.GREEN, Color.BLACK);
        fields[29] = new GUI_Street("Red Line Railroad", "Price: $2","", "+82",Color.WHITE, Color.RED);
        fields[30] = new GUI_Street("Loop The Loop", "Price: $1","", "+82",Color.BLUE, Color.BLACK);
        fields[31] = new GUI_Street("Roller Coaster","Price: $1","", "+82",Color.BLUE, Color.BLACK);
        return fields;
    }



}
