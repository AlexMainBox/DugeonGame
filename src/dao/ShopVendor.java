package dao;

import controllers.Shop;
import model.Entity;
import model.Player;
import utils.Chooser;

import java.util.Collection;

public class ShopVendor {
    private String name;
    private Shop shop;

    public ShopVendor(String name) {
        this.name = name;
        shop = Shop.getInstance();
    }

    public void showAllEntity() {
        shop.showShop();
    }

    public void addInShop(Collection<Entity> entities) {
        if (entities != null) shop.addAllInShop(entities);
    }

    public void addInShop(Entity entity) {
        if (entity != null) shop.addInShop(entity);
    }

    public boolean saleEntity(Player player) {
        Entity entity = player.saleEntity();
        if (entity != null) {
            player.setGold(player.getGold() + entity.getCost());
            player.getBag().remove(entity);
            return true;
        } else {
            return false;
        }
    }

    public boolean buyEntity(Player player) {
        System.out.println("Please, choose your product!");
        showAllEntity();
        int indexEntity = Chooser.choose() - 1;
        try {
            if (player.getGold() >= shop.buyEntity(indexEntity).getCost()) {
                player.setGold(player.getGold() - shop.buyEntity(indexEntity).getCost());
                player.addInBag(shop.buyEntity(indexEntity));
                return true;
            } else
                System.out.println("Do not have enough money ");
            return false;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Your choice is not correct. Please, try again");
            return false;
        }
    }

    @Override
    public String toString() {
        return "ShopVendor - " +
                "name = " + name;
    }
}
