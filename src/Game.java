import controllers.Dungeon;
import dao.ShopVendor;
import entities.Warrior;
import utils.*;

import java.io.IOException;

public class Game {

    public void run() {
        int exitGame = 0;
        Warrior warrior = null;
        Dungeon dungeonLvlOne = new Dungeon("Old City", new OldCityDungeon().addAll());
        ShopVendor vendor = new ShopVendor("Bob");
        vendor.addInShop(new ArmorsSet().armorSetLvlOne());

        StartMenu.menu();
        switch (Chooser.choose()) {
            case 1:
                System.out.println("New Game");
                warrior = new Warrior("Warrior");
                System.out.println("Character created!");
                warrior.showMyStats();
                System.out.println("");
                break;
            case 2:
                try {
                    warrior = (Warrior) RenewPlayer.renew();
                    System.out.println("Renew complete, your character!");
                    warrior.showMyStats();
                    System.out.println("");
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("File not found, New Game created");
                    warrior = new Warrior("Warrior");
                }
        }
        while (exitGame != 5)
            exitGame = Move.move(warrior, vendor, dungeonLvlOne);
    }
}
