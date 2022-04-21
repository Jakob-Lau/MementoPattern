package de.dhbw.Strategies;

import java.util.Random;

public class Strategy {
    int AmountRollsLeft = 3;
    int CurrentAmount = 0;
    private String StrategyName = "NoName";

    public Strategy(String aStrategyName) {
        this.StrategyName = aStrategyName;
    }

    protected final int rollDice() {
        int value = 0;
        if (this.AmountRollsLeft > 0) {
            Random randomGenerator = new Random();
            value = randomGenerator.nextInt(10) + 1;
            //System.out.println("\tDie Strategie '" + this.StrategyName + "' würfelt eine " + value);
            --this.AmountRollsLeft;
        }

        return value;
    }

    public int playStrategy() {
        return this.rollDice();
    }

    public String getPlayerName() {
        return this.StrategyName;
    }
}
