package game;

public class Properties {
    // variables
    protected String fieldName;
    private int Outcome;
    private String Field;
    private String Description;

    public String getFieldName() {
        return fieldName;
    }

    public String toString() {
        return fieldName;
    }

    public Properties(int Outcome, String Field, String Description, String fieldName) {
        this.fieldName = fieldName; // Constructor
        this.Outcome = Outcome;
        this.Field = Field;
        this.Description = Description;
    }

    public void Arrived(Player p){
        //This methods shows which property the player lands on and the outcome from the field
        // in connection with the bank account
        p.getBank().add(Outcome);
        Language.Arrived(Field, Description, Outcome, p.getBank());

    }

}
