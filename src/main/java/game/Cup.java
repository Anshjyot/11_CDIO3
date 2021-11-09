package game;

public class Cup {

    Dice dice1 = new Dice(6);
    Dice dice2 = new Dice(6);

    public Cup() { // The roll() method from Dice.java is used here
    }

    public void rolling(){ // The roll() method from Dice.java is used here
        dice1.roll();
        dice2.roll();
    }

    public int sum() { // Sum method, returns die1 + die2 sums

        int die1result = dice1.getFaceValue();
        int die2result = dice2.getFaceValue();

        return die1result + die2result;
    }
}

