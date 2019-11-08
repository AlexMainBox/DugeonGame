package model;

import java.io.Serializable;

public abstract class Person implements Serializable {
    
    private String name;
    private int HPoint;
    private int lvl = 1;
    private int armor;
    private int damage;
    private int gold;

    public Person(String name, int HPoint, int armor, int damage, int gold) {
        this.name = name;
        this.HPoint = HPoint;
        this.armor = armor;
        this.damage = damage;
        this.gold = gold;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHPoint() {
        return HPoint;
    }

    public void setHPoint(int HPoint) {
        this.HPoint = HPoint;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public String toString() {
        return "name = " + name + '\'' +
                ", HPoint = " + HPoint +
                ", lvl = " + lvl +
                ", armor = " + armor +
                ", damage = " + damage +
                ", gold = " + gold;
    }
}
