package game;

import GUI.GUIController;

public class OwnedProperty extends Square {

    public OwnedProperty(String fieldname, int price, int rent, GUIController controller) {
        super(fieldname);
        this.price = price;
        this.rent = rent;
        this.controller = controller;
    }

    int price;
    int rent;
    Player owner;
    GUIController controller;

    @Override
    public void Arrived(Player player) {
        if (owner == null){
            player.getAccount().setBalance(player.getAccount().getBalance() - price);
            owner = player;
            controller.showMessage(player.getPlayerName() + " bought " + fieldName + " for " + "$"+price);
        }

        else {
            player.getAccount().setBalance(player.getAccount().getBalance() - rent);
            owner.getAccount().setBalance(owner.getAccount().getBalance() + rent);
            controller.showMessage(player.getPlayerName() + " rented " + owner.getPlayerName()+"'s" + " property: " +  fieldName + " for " + "$"+rent);
        }
    }





}
