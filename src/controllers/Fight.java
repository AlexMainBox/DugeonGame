package controllers;

import entities.Enemy;
import model.Player;
import utils.Chooser;

public class Fight {

    public static int fightToDeath(Player player, Enemy enemy) {
        int result;
        int playerHPointChecker = player.getHPoint();
        int enemyHPointChecker = enemy.getHPoint();

        do {
            enemyHPointChecker -= player.skillChooser() - enemy.getArmor();
            playerHPointChecker -= enemy.hit() - player.getArmor();
            System.out.println(" ");
            System.out.println(enemy.getName() + ": HPoints = " + enemyHPointChecker);
            System.out.println("Your HPoints = " + playerHPointChecker);
        } while (enemyHPointChecker > 0 && playerHPointChecker > 0);

        if (enemyHPointChecker <= 0 & playerHPointChecker <= 0) {
            System.out.println("\n" + "OMG - It's dead heat, try again");
            result = 0;

        } else if (playerHPointChecker <= 0) {
            System.out.println("\n" + "Sorry, but you lose. Fine - 1 gold");
            if (player.getGold() > 0) player.setGold(player.getGold() - 1);
            result = 0;
        } else {
            System.out.println("\n" + "Congratulations! You are the winner! ");
            System.out.println("You winn " + enemy.getGold() + " gold");
            player.setGold(player.getGold() + enemy.getGold());
            System.out.println("\n" + "1) Continue fight");
            System.out.println("2) Exit Dungeon");
            result = Chooser.choose();
        }
        return result;
    }
}
