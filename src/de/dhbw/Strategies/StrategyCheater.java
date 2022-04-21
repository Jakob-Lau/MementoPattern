package de.dhbw.Strategies;

public class StrategyCheater extends Strategy {
    public StrategyCheater(String aPlayername) {
        super(aPlayername);
    }

    public int playStrategy() {
        this.rollDice();
        this.rollDice();
        this.rollDice();
        return 10;
    }
}
