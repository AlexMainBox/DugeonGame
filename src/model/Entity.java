package model;

import java.io.Serializable;
import java.util.Objects;

public abstract class Entity implements Serializable {
    private String name;
    private EntityType entityType;
    private int cost;
    private int count;

    public Entity(String name, EntityType entityType, int cost) {
        this.name = name;
        this.entityType = entityType;
        this.cost = cost;
        this.count = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return entityType == entity.entityType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(entityType);
    }

    @Override
    public String toString() {
        return entityType + " - " + " name = " + name +
                ", cost = " + cost;

    }
}
