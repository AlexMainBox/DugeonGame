package model;

public abstract class Potion extends Entity {

    private int pointRegenerate;

    public Potion(String name, EntityType entityType, int cost, int pointRegenerate) {
        super(name, entityType, cost);
        this.pointRegenerate = pointRegenerate;
    }

    public int usePotion(){
        return pointRegenerate;
    }

    public int getPointRegenerate() {
        return pointRegenerate;
    }

    public void setPointRegenerate(int pointRegenerate) {
        this.pointRegenerate = pointRegenerate;
    }

    @Override
    public String toString() {
        return "Potion - " +
                "pointRegenerate = " + pointRegenerate +
                super.toString();
    }
}

