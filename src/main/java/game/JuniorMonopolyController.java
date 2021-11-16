package game;

public class JuniorMonopolyController {
    Board board;
    private Player[] players;
    /**
     * @author Sofie
    * @param language
    * @param guiController
    */
    //todo Skal laves til et array
    public void createPlayer (Language language, GUIController guiController){
        int numberOfPlayers = guiController.getIntegerInput(language.getText(2,2),2, 4);
        players = new Player [numberOfPlayers];
        for(int i = 0;i<numberOfPlayers;i++){
            String playername = guiController.getStringInput(language.getText(2,3));
            players[i]= new Player(playername);

        }
    }

    private GUIController gui = new GUIController();

    public void runGame() {
        board = new Board(players, gui);
        int turn = 0;

        while (true) { //  infinite loop
            // uses methods from Language class in correlation with system.out.println

            Language.PlayerRoll(players[turn]);
            gui.board.showMessage("Throw Dice");
            playerTurn(players[turn]);

          //metode der returnerer true eller en spilelr som har flest penge
            if (checkWinner() != null)
                //game end
                System.exit(0);
            }
        // Skal lige ændres da den altid returnerer null.. værdien skal ændres ovenover.
           // turn = (turn + 1) % players.length;
        }
        public Player checkWinner() {
        //if (plaerbalance == 0)
        //  checking all player and find the richest and return him
        // return richestPlayer
        //else
        //return null
            return null;
        }

    //Player turn

    public void playerTurn(Player player) {

        Cup cup = new Cup();

        cup.rolling();

        gui.GUIDice(cup);

        Language.PlayerRolled(player, cup);
// todo: Husk at være opmærksom på det skal opdateres når spilleren kan rykke hele vejen rundt på brættet
        gui.MoveCar(player,cup.sum());

        Square LandOn = board.properties[cup.sum()];
        LandOn.Arrived(player);

        if (LandOn == board.properties[10]) { // if you land on property 10, you get another chance
            cup.rolling();
            Language.PlayerRolled(player, cup);
            board.properties[cup.sum()].Arrived(player);
        }
        gui.GUIBalance(player);

      }

    }


