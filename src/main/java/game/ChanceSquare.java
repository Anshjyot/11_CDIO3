package game;

import GUI.GUIController;

import java.util.List;

public class ChanceSquare extends Square {

    // int outcome;
    private List<Player> players;
    private GUIController controller;

    public ChanceSquare(String fieldName, List<Player> players, GUIController controller){
        super(fieldName);
        this.controller = controller;
        this.players = players;
    }

    @Override
    public void Arrived(Player p) {

        super.Arrived(p);
        int cards = (int) (Math.random()*4);
        switch (cards){
            case 0: p.getAccount().setBalance(p.getAccount().getBalance()-2); // "You ate to much candy, pay $2 to the bank"
                controller.showMessage("You ate to much candy, pay $2 to the bank");
                break;
            case 1: p.getAccount().setBalance(p.getAccount().getBalance()+2);
                controller.showMessage("You have made your homework");
                //laver en lille fejl med at det er den modsatte spiller som modtager de $2.
                break;
            case 2: p.getAccount().setBalance(p.getAccount().getBalance()+2); //+ ryk frem til start
                controller.showMessage("Go to Start");
                controller.RemoveCar(p.getPosition(),p.getIndex());
                p.setPosition(0);
                controller.AddCar(p.getPosition(),p.getIndex());
                break;
            case 3:
                int sum = 0;
                for (Player otherPlayer : players) {
                    if(otherPlayer != p) {
                        sum += 1;
                        otherPlayer.getAccount().setBalance(otherPlayer.getAccount().getBalance()-1);
                    }
                }
                p.getAccount().setBalance(p.getAccount().getBalance() + sum);//modtager 1 fra alle spillere 1-3
                controller.showMessage("Get $1 from every player");
                break;
            default: System.out.println(cards);
        }


    }
//   int C1 =adjustbalance +2
    //switch statement

    // lige nu tager den et specifikt chancekort på et bestemt felt.



}
