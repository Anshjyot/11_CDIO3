package game;

public abstract class Purchased extends Properties {

    private int price;
    protected Player owner;

    public Purchased(String fieldName, int price) {
        super(fieldName);
        this.price = price;
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
