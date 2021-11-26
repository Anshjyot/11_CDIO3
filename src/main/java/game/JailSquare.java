package game;

import GUI.GUIController;

public class JailSquare extends Square {
    private GUIController controller;
    public JailSquare(String fieldName, GUIController controller) {
        super(fieldName);
        this.controller = controller;
    }

    @Override
    public void Arrived(Player p) {
        controller.showMessage("JAIL TIME");
        controller.RemoveCar(p.getPosition(), p.getIndex());
        p.setPosition(p.getPosition() - 16);
        controller.AddCar(p.getPosition(), p.getIndex());

    }


}
