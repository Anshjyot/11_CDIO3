package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JuniorMonopolyController {
    Board board;
    private List<Player> players = new ArrayList<Player>();
    /**
     * @author Sofie
    * @param language
    * @param guiController
    */
    //todo Skal laves til et array
    public void createPlayer (Language language, GUIController guiController){
        int numberOfPlayers = guiController.getIntegerInput(language.getText(2,2),2, 4);

        for(int i = 0;i<numberOfPlayers;i++){
            String playername = guiController.getStringInput(language.getText(2,3));
            players.add(new Player(playername));
        }

        gui.createPlayer(players);
        for (Player player : players) {
            player.toString();
        }
    }

    private GUIController gui = new GUIController();

    public void runGame() {
        board = new Board(players, gui);
        int turn = 0;
        Language language = new Language();
        createPlayer(language, gui);

        while (true) { //  infinite loop
            // uses methods from Language class in correlation with system.out.println

            Language.PlayerRoll(players.get(turn)); //kan slettes??
            gui.board.showMessage("Throw Dice");
            playerTurn(players.get(turn));

            turn = (turn + 1) % players.size();

          //metode der returnerer true eller en spilelr som har flest penge
            if (checkWinner() != null)
                //game end
                System.exit(0);
            }
        // Skal lige ændres da den altid returnerer null.. værdien skal ændres ovenover.
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


