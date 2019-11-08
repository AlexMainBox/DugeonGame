package model;

import controllers.Armory;
import entities.PotionHP;
import utils.Chooser;
import utils.StandardWarriorEquip;

import java.util.ArrayList;

public abstract class Player extends Person {

    private ArrayList<Armory> equip;
    private ArrayList<Entity> bag;

    public Player(String name) {
        super(name);
        setHPoint(100);
        setGold(10);
        setDamage(10);
        equip = new ArrayList<>(5);
        bag = new ArrayList<>();
        equip.addAll(new StandardWarriorEquip().standardEquip());
        firstStatsUpdate();
    }

    public abstract int hit();

    public abstract int skillChooser();

    /*The method performs the logic of dressing the clothes.
      Checks whether there is clothing in the bag and after changing the old cloth to the new one,
      the old one puts out of the equipment into the bag*/
    public boolean putOn() {
        try {
            showBag();
            int newArmoryPosition = Chooser.choose() - 1;
            Armory armory = (Armory) bag.get(newArmoryPosition);
            if (getBag().contains(armory) || getEquip().contains(armory)) {
                Armory oldArmory = getEquip().set(takeOff(armory), armory);
                bag.set(newArmoryPosition, oldArmory);
                setDamage(getDamage() + armory.getDamageBonus());
                setHPoint(getHPoint() + armory.gethPointsBonus());
                setArmor(getArmor() + armory.getArmorBonus());
                return true;
            } else System.out.println(armory.getName() + " - Not found");
            return false;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong choice, try again");
            return false;
        }
    }

    private int takeOff(Armory armory) {
        Armory oldArmory = equip.get(equip.indexOf(armory));
        setDamage(getDamage() - oldArmory.getDamageBonus());
        setHPoint(getHPoint() - oldArmory.gethPointsBonus());
        setArmor(getArmor() - oldArmory.getArmorBonus());
        return equip.indexOf(armory);
    }

    private void firstStatsUpdate() {                           //Update player stats, when first adding equipment.
        for (Armory armory : equip) {
            setDamage(getDamage() + armory.getDamageBonus());
            setHPoint(getHPoint() + armory.gethPointsBonus());
            setArmor(getArmor() + armory.getArmorBonus());
        }
    }

    public Entity saleEntity() {
        try {
            if (!bag.isEmpty()) {
                showBag();
                return bag.get(Chooser.choose() - 1);
            } else {
                System.out.println("Your bag is empty");
                return null;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong choice, please try again");
            return null;
        }
    }

    public void showMyStats() {
        System.out.println(toString());
    }

    public void showEquip() {
        for (Armory armory : equip) {
            System.out.println(armory.toString());
        }
    }

    public void showBag() {
        if (!bag.isEmpty()) {
            for (Entity entity : bag) {
                System.out.println(bag.indexOf(entity) + 1 + ")" + entity);
            }
        } else System.out.println("Your bag is empty");
    }

    public void addInBag(Entity entity) {
        if (bag.contains(entity)) {
            int entityInBag = bag.indexOf(entity);
            bag.get(entityInBag).setCost(bag.get(entityInBag).getCount() + entity.getCount());
        } else {
            bag.add(entity);
        }

    }

    public ArrayList<Armory> getEquip() {
        return equip;
    }

    public void setEquip(ArrayList<Armory> equip) {
        this.equip = equip;
    }

    public ArrayList<Entity> getBag() {
        return bag;
    }

    public void setBag(ArrayList<Entity> bag) {
        this.bag = bag;
    }
}
