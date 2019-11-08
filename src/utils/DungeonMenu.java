package utils;

import controllers.Dungeon;
import model.Player;
import model.Potion;

public class DungeonMenu {

    public static void menu(Dungeon dungeon, Player player) {
        int choose;
        do {
            TextReader.read("./src/view/DungeonMenu");
            choose = Chooser.choose();
            switch (choose) {
                case 1:
                    dungeon.showAll();
                    System.out.println("");
                    break;
                case 2:
                    dungeon.fightInDungeon(player);
                    break;
                case 3:
                    break;
            }
        } while (choose != 3);
    }
}
