package de.dhbw;

import de.dhbw.Strategies.*;
import de.dhbw.game.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("Maus", new Strategy("Einmal Würfeln")));
        playerList.add(new Player("Hund", new StrategyRollAgain("Dreimal Würfeln")));
        playerList.add(new Player("Fuchs", new StrategyKeepAbove5("Über fünf merken")));
        playerList.add(new Player("Wolf", new StrategyCheater("Cheater")));

        Game game = new Game(playerList);
        game.playGame();
        game.showResults();

        Snapshot backup = game.backup();

        game.playGame();
        game.showResults();

        backup.restore();
        game.showResults();
    }
}
