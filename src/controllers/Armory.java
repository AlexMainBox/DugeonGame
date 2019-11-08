package controllers;

import model.Entity;
import model.EntityType;

public class Armory extends Entity {

    private int damageBonus;
    private int hPointsBonus;
    private int armorBonus;

    public Armory(String name, EntityType entityType, int cost, int damageBonus, int hPointsBonus, int armorBonus) {
        super(name, entityType, cost);
        this.damageBonus = damageBonus;
        this.hPointsBonus = hPointsBonus;
        this.armorBonus = armorBonus;
    }

    public int getDamageBonus() {
        return damageBonus;
    }

    public void setDamageBonus(int damageBonus) {
        this.damageBonus = damageBonus;
    }

    public int gethPointsBonus() {
        return hPointsBonus;
    }

    public void sethPointsBonus(int hPointsBonus) {
        this.hPointsBonus = hPointsBonus;
    }

    public int getArmorBonus() {
        return armorBonus;
    }

    public void setArmorBonus(int armorBonus) {
        this.armorBonus = armorBonus;
    }

    @Override
    public String toString() {
        return getEntityType() + " - " +
                "name = " + getName() +
                ", damageBonus = " + damageBonus +
                ", hPointsBonus = " + hPointsBonus +
                ", armorBonus = " + armorBonus +
                ", price = " + getCost();
    }
}
