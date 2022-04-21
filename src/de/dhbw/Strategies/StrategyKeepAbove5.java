package de.dhbw.Strategies;

public class StrategyKeepAbove5 extends Strategy {
    public StrategyKeepAbove5(String aPlayerName) {
        super(aPlayerName);
    }

    public int playStrategy() {
        while(this.AmountRollsLeft > 0 && this.CurrentAmount < 5) {
            this.CurrentAmount = this.rollDice();
        }

        return this.CurrentAmount;
    }
}
