package controllers;

import model.Entity;

import java.util.ArrayList;
import java.util.Collection;

public class Shop {

    private static Shop instance;
    private String name;                  //Don't uses
    private ArrayList<Entity> shop;

    private Shop() {
        name = "Magic Shop";
        shop = new ArrayList<>();
    }

    public static Shop getInstance() {
        if (instance == null)
            synchronized (Shop.class) {
                if (instance == null)
                    instance = new Shop();
            }
        return instance;
    }

    public Entity buyEntity(int indexEntity) {
        return shop.get(indexEntity);
    }

    public int saleEntity(Entity entity) {
        return entity.getCost();

    }

    public boolean addAllInShop(Collection<Entity> entities) {
        if (!entities.isEmpty()) {
            shop.addAll(entities);
            return true;
        } else return false;
    }

    public void showShop() {
        for (Entity entity : shop) {
            System.out.println(shop.indexOf(entity) + 1 + ") " + entity.toString());
        }
    }

    public void addInShop(Entity entity) {
        shop.add(entity);
    }
}
