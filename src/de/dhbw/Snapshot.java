package de.dhbw;

import de.dhbw.game.Game;
import de.dhbw.game.Player;

import java.util.HashMap;
import java.util.Map;

public class Snapshot {
    private Game game;
    private Map<Player, Integer> players;

    public Snapshot(Game game, Map<Player, Integer> players) {
        this.game = game;
        this.players = new HashMap<>();
        players.forEach((player, value) -> this.players.put(player, value));
    }

    public void restore() {
        game.setPlayers(this.players);
    }
}
