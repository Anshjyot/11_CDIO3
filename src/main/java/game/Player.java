package game;

public class Player {

    private Account account;
    private String PlayerName;
    private int currentposition;

    public Player(String PlayerName, int balance, int Startfield) {
        this.setPlayerName(PlayerName);
        this.setAccount(new Account(balance));
        this.setPosition(Startfield);
    }

    public Player() { }

    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }
    public String getPlayerName() {
        return PlayerName;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public Account getAccount() {
        return account;
    }

    public void setPosition(int currentposition) {
        this.currentposition = currentposition;
    }
    public int getPosition() {
        return currentposition;
    }
}
