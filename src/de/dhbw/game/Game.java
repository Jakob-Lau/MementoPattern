package de.dhbw.game;

import de.dhbw.Snapshot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private Map<Player, Integer> players;

    public Game(List<Player> players) {
        if (players.size() == 0) {
            throw new IllegalArgumentException("You can't play a game without any players");
        }
        this.players = new HashMap<>();
        players.forEach(player -> this.players.put(player, 0));
    }

    public void setPlayers(Map<Player, Integer> players) {
        this.players = players;
    }

    public void playGame() {
        players.keySet().forEach(player -> players.replace(player, player.play()));
    }

    public void showResults() {
        StringBuilder sb = new StringBuilder();
        players.forEach((key, value) -> sb.append(key.playerName)
                .append(":\t\t")
                .append(value)
                .append("\n"));
        System.out.println(sb);
    }

    public Snapshot backup() {
        return new Snapshot(this, players);
    }
}
