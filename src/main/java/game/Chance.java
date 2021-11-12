package game;

public class Chance extends Square {

   // int outcome;
    private Player[] players;
    private GUIController controller;

    public Chance (String fieldName, Player[] players, GUIController controller){
        super(fieldName);
        this.players = players;
        this.controller = controller;
    }

    @Override
    public void Arrived(Player p) {

    super.Arrived(p);
        int cards = (int) (Math.random()*4+1);
        switch (cards){
            case 0: p.getBank().add(-2); // "You ate to much candy, pay $2 to the bank"
                Language.Arrived(fieldName, "You ate to much candy, pay $2 to the bank", -2, p.getBank());
                break;
            case 1: p.getBank().add(+2);
                Language.Arrived(fieldName, "You have made your homework", +2, p.getBank());
                //laver en lille fejl med at det er den modsatte spiller som modtager de $2. 
                break;
            case 2: p.getBank().add (+2); //+ ryk frem til start
                Language.Arrived(fieldName,"go to Start",+2, p.getBank());

                controller.MoveCar(p,0);
                break;
            case 3:
                int sum = 0;
                for (Player otherPlayer : players) {
                    if(otherPlayer != p) {
                        sum += 1;
                        otherPlayer.getBank().add(-1);
                    }
                }
                p.getBank().add (sum);//modtager 1 fra alle spillere 1-3
                Language.Arrived(fieldName,"get $1 from every player",+1 , p.getBank());
                break;
        }
    }
//   int C1 =adjustbalance +2
    //switch statement

    // lige nu tager den et specifikt chancekort på et bestemt felt.



}
