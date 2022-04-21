package de.dhbw.Strategies;

public class StrategyRollAgain extends Strategy {
    public StrategyRollAgain(String aPlayerName) {
        super(aPlayerName);
    }

    public int playStrategy() {
        super.playStrategy();
        this.rollDice();
        this.rollDice();
        return 10;
    }
}
