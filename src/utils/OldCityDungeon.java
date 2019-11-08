package utils;

import entities.Enemy;

import java.util.ArrayList;

public class OldCityDungeon {
    private ArrayList<Enemy> oldCity = new ArrayList<>();
    private Enemy ogrWarrior = new Enemy("Ogr Warrior", 100, 2, 10, 1);
    private Enemy trollWarrior = new Enemy("Troll Warrior", 120, 5, 5, 2);
    private Enemy ogrMage = new Enemy("Ogr Mage", 80, 0, 15, 1);
    private Enemy trollBoss = new Enemy("Troll Boss", 160, 10, 20, 1);

    public ArrayList<Enemy> addAll() {
        oldCity.add(ogrWarrior);
        oldCity.add(trollWarrior);
        oldCity.add(ogrMage);
        oldCity.add(trollBoss);
        return oldCity;
    }
}
