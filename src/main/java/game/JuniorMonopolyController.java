package game;

public class JuniorMonopolyController {
    Board board;

    static Player player1 = new Player();
    static Player player2 = new Player();
    private GUIController gui = new GUIController();

    public static void main(String[] args) {
        JuniorMonopolyController game = new JuniorMonopolyController();
        game.board = new Board(new Player[] {player1, player2}, game.gui);

        game.PlayerName();
        game.setupPlayer();

        while (true) { //  infinite loop
            // uses methods from Language class in correlation with system.out.println

            Language.PlayerRoll(player1);
            game.gui.board.showMessage("Throw Dice");
            game.Player(player1);

            if (player1.bank.amount >= 3000) {
                Language.PlayerWon(player1);
                System.exit(0);
            }

            Language.PlayerRoll(player2);
            game.gui.board.showMessage("Throw Dice");
            game.Player(player2);

            if (player2.bank.amount >= 3000) {
                Language.PlayerWon(player2);
                System.exit(0);
            }
        }
    }


    //Player name.

    public void PlayerName() {

        player1.setPlayerName( gui.GUIName());
        player2.setPlayerName( gui.GUIName());
        Language.Intro(player1, player2);

    }

    //Player turn

    public void Player(Player player) {

        Cup cup = new Cup();

        cup.rolling();

        gui.GUIDice(cup);

        Language.PlayerRolled(player, cup);

        gui.MoveCar(player,cup.sum()-1);

        Square LandOn = board.properties[cup.sum()];
        LandOn.Arrived(player);

        if (LandOn == board.properties[10]) { // if you land on property 10, you get another chance
            cup.rolling();
            Language.PlayerRolled(player, cup);
            board.properties[cup.sum()].Arrived(player);
        }
        gui.GUIBalance(player);

    }

    //Inserts the player-figures in the gui

    public void setupPlayer() {
        gui.addPlayers(new Player[]{player1, player2});
    }
}

