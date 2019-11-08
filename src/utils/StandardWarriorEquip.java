package utils;

import controllers.Armory;
import model.EntityType;

import java.util.ArrayList;

public class StandardWarriorEquip {

    private ArrayList<Armory> equip = new ArrayList<>();
    private Armory oldRustySword = new Armory("Old Rusty Sword", EntityType.Weapon, 0, 1, 0, 0);
    private Armory oldHead = new Armory("Old Head", EntityType.Head, 0, 0, 2, 1);
    private Armory oldChest = new Armory("Old Chest", EntityType.Chest, 0, 0, 2, 1);
    private Armory oldPents = new Armory("Old Pents", EntityType.Pents, 0, 0, 2, 1);
    private Armory oldBoots = new Armory("Old Boots", EntityType.Boots, 0, 0, 2, 1);

    public ArrayList<Armory> standardEquip() {
        equip.add(oldRustySword);
        equip.add(oldHead);
        equip.add(oldChest);
        equip.add(oldPents);
        equip.add(oldBoots);
        return equip;
    }
}
