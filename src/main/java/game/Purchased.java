package game;

public abstract class Purchased extends Properties {

    private int price;
    protected Player owner;

    public Purchased(int Outcome, String Field, String Description, String fieldName) {
        super(Outcome, Field, Description, fieldName);
    }

    public int getPrice() {
        return price;
    }

    private Player getOwner() {
        return owner;
    }

    private void setOwner(Player newOwner) {
        owner = newOwner;
    }

    private boolean checkIfOwned() {
        if (owner == null)
            return false;
        else
            return true;
    }

}
