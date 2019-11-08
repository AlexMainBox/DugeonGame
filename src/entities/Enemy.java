package entities;

import model.Person;

public class Enemy extends Person {

    public Enemy(String name, int HPoint, int armor, int damage, int gold) {
        super(name, HPoint, armor, damage, gold);
    }

    public int hit() {                                        //random damage +- 20%
        int maxDamage = getDamage() + getDamage() * 20 / 100;
        int minDamage = getDamage() - getDamage() * 20 / 100;
        double randomDamage = (Math.random() * (maxDamage - minDamage)) + minDamage;
        System.out.println(getName() + " damage = " + (int) randomDamage);
        return (int) randomDamage;
    }

    public void showStats() {
        System.out.println(toString());
    }

}
