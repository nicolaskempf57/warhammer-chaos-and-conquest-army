package fr.warhammerchaosandconquest.army.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Unit {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private UnitType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnitType getType() {
        return type;
    }

    public void setType(UnitType type) {
        this.type = type;
    }

    public Unit(int id, String name, UnitType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Unit() {
    }
}
