package controllers;

import entities.Enemy;
import model.Player;
import java.util.ArrayList;
import java.util.Collection;

public class Dungeon {
    private String name;
    private ArrayList<Enemy> dungeon = new ArrayList<>();

    public Dungeon(String name, Collection<Enemy> enemies) {
        this.name = name;
        dungeon.addAll(enemies);
    }

    public boolean addEnemy(Enemy enemy) {
        return dungeon.add(enemy);
    }

    public boolean addAllEnemies(Collection<Enemy> enemies) {
        return dungeon.addAll(enemies);
    }

    public void fightInDungeon(Player player) {
        int result;
        for (Enemy enemy : dungeon) {
            System.out.println("You are fighting with - " + enemy.toString());
            result = Fight.fightToDeath(player, enemy);
            if (result != 1) {
                break;
            }
        }
    }

    public void showAll() {
        for (Enemy enemy : dungeon) {
            System.out.println(enemy.toString());
        }
    }

    @Override
    public String toString() {
        return "Dungeon{" +
                "name='";
    }
}
