package game;

public class Dice {

    private int numOfSides;
    private int faceValue;

    public Dice(int numberOfSides)
    {
        numOfSides = numberOfSides;

        faceValue = (int)(Math.random()*numOfSides) + 1;

    } // Contructor ends

    public void roll() // Simulation af the dice throw
    {
        faceValue = (int)(Math.random()*numOfSides) + 1;

    }

    public int getFaceValue() // Returns the value of dice
    {
        return faceValue;
    }
}



