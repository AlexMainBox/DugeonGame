package utils;

import controllers.Armory;
import model.EntityType;

import java.util.ArrayList;

public class ArmorsSet {
    private ArrayList<Armory> armorSet = new ArrayList<>();

    public ArrayList armorSetLvlOne() {
        Armory sword = new Armory("Iron Sword", EntityType.Weapon, 15, 5, 0, 0);
        Armory head = new Armory("Shabby Head", EntityType.Head, 10, 0, 5, 2);
        Armory chest = new Armory("Iron Chest", EntityType.Chest, 8, 0, 5, 3);
        Armory pents = new Armory("Leather Pents", EntityType.Pents, 5, 0, 2, 2);
        Armory boots = new Armory("Lightweight Boots", EntityType.Boots, 10, 0, 5, 3);
        armorSet.add(sword);
        armorSet.add(head);
        armorSet.add(chest);
        armorSet.add(pents);
        armorSet.add(boots);
        return armorSet;
    }


}
