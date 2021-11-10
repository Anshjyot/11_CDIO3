package game;

public class OwnedProperty extends Purchased {
    private int rent;

    public OwnedProperty(String fieldName, int price, int rent) {
        super(fieldName, price);
        this.rent = rent;
    }

}
