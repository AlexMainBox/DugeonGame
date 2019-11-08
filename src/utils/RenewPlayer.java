package utils;


import model.Player;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RenewPlayer {

    static public Player renew() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("./src/PlayerSavingDB/Save"));
        return (Player) objectInputStream.readObject();

    }
}
