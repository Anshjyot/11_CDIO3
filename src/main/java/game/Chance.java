package game;

import java.util.Random;

public class Chance {
    private int field = 0;
    private int value = 0;
    private String text = "";
    private int amount = 0;


    public Chance() {
    }

    public Chance(String text, int amount, int field, int value) {
        this.setTextMessage(text);
        this.setAmount(amount);
        this.setField(field);
        this.setValue(value);
    }

    private Chance[] chance = new Chance[5];

    public void CreateChanceCard() {
        chance[0] = new Chance("Go to Start and receive $2", 2, 0, 1);
        chance[1] = new Chance("You ate to much candy, pay $2 to the bank", -2, 0, 4);
        chance[2] = new Chance("You will receive $1", 1, 0, 6);
        chance[3] = new Chance("Move 5 fields ahead", 0, 5, 2);
        chance[4] = new Chance("You have made your homework. You will receive $2", 2, 0, 7);
    }

    public Chance getChanceCard() {
        Random random = new Random();
        int i = random.nextInt(chance.length);
        return chance[i];
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public void setField(int field) {
        this.field = field;
    }
    public int getField() {
        return field;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public void setTextMessage(String text) {
        this.text = text;
    }
    public String getTextMessage() {
        return text;
    }



}