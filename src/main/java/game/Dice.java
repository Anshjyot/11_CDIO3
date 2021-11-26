package game;

public class Dice {
    private int dice;

    public Dice(int dice) {
        this.dice = dice;
    }

    public Dice() {
    }

    public void ThrowDice() {
        dice = (int) (Math.random() * 6) + 1;
    }

    public int getDice() {
        return dice;
    }
}
