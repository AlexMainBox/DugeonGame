package utils;

import controllers.Dungeon;
import dao.ShopVendor;
import model.Player;
import model.Potion;

public class Move {
    public static int move(Player player, ShopVendor vendor, Dungeon dungeon) {
        TextReader.read("./src/view/Move");
        int choose;
        do {
            choose = Chooser.choose();
            switch (choose) {
                case 1:
                    ShopMenu.menu(player, vendor);
                    break;
                case 2:
                    DungeonMenu.menu(dungeon, player);
                    break;
                case 3:
                    SavePlayer.save(player);
                    break;
                case 4:
                    PlayerMenu.menu(player);
                    break;
                case 5:
                    break;
            }
        } while (choose == 3);
        return choose;
    }
}
