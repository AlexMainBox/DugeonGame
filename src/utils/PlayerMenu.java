package utils;

import model.Player;

public class PlayerMenu {
    public static void menu(Player player) {

        int choose;
        do {
            TextReader.read("./src/view/PlayerMenu");
            choose = Chooser.choose();
            switch (choose) {
                case 1:
                    player.showMyStats();
                    break;
                case 2:
                    player.showBag();
                    break;
                case 3:
                    player.showEquip();
                    break;
                case 4:
                    if (player.putOn()) System.out.println("Operation Successful!");
                    break;
                case 5:
                    break;
            }
        } while (choose != 5);

    }
}
