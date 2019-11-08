package entities;

import model.EntityType;
import model.Potion;

public class PotionHP extends Potion {

    public PotionHP(String name, EntityType entityType, int cost, int pointRegenerate) {
        super(name, entityType, cost, pointRegenerate);
    }
}
