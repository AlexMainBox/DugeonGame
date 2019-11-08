package utils;

import model.Player;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SavePlayer {

    public static void save(Player player) {
        try {
            FileOutputStream save = new FileOutputStream("./src/PlayerSavingDB/Save");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(save);
            objectOutputStream.writeObject(player);
            objectOutputStream.close();
            System.out.println("Save complete " + player.toString());
        } catch (IOException e) {
            System.out.println("Not correct file");
        }
    }
}
