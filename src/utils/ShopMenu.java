package utils;

import dao.ShopVendor;
import model.Player;

public class ShopMenu {

    public static void menu(Player player, ShopVendor vendor) {
        int choose;
        do {
            TextReader.read("./src/view/ShopMenu");
            choose = Chooser.choose();
            switch (choose) {
                case 1:
                    vendor.showAllEntity();
                    System.out.println("\n");
                    break;
                case 2:
                    if (vendor.saleEntity(player))
                        System.out.println("Successful operation!");
                    break;
                case 3:
                    if (vendor.buyEntity(player))
                        System.out.println("Successful operation!");
                    break;
                case 4:
                    break;
            }
        } while (choose != 4);
    }
}
