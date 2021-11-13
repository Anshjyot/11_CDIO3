package game;

public class Properties extends Square{
    // variables
    protected String fieldName;
    private int Outcome;
    private String Description;

    public String getFieldName() {
        return fieldName;
    }

    public String toString() {
        return fieldName;
    }

    public Properties(int Outcome, String Description, String fieldName) {
        super(fieldName);
        this.fieldName = fieldName; // Constructor
        this.Outcome = Outcome;
        this.Description = Description;
    }

    public void Arrived(Player p){
        //This methods shows which property the player lands on and the outcome from the field
        // in connection with the bank account

      p.getBank().add(Outcome);  /** Der stod 30 i add() før */
      Language.Arrived(fieldName, Description, Outcome, p.getBank());
       // Language.Arrived(Field, Description, Outcome, p.getBank());

    }

}
