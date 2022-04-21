package de.dhbw.game;

import de.dhbw.Strategies.Strategy;

public class Player {
    public Strategy strategy;
    public String playerName = "";

    public Player(String aPlayerName, Strategy aStrategy) {
        this.playerName = aPlayerName;
        this.strategy = aStrategy;
    }

    public int play() {
        int rolledValue = this.strategy.playStrategy();
        //System.out.println(this.playerName + ": Ich habe eine " + rolledValue + " gewürfelt.\n");
        return rolledValue;
    }
}
