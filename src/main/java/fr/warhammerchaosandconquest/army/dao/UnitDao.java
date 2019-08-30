package fr.warhammerchaosandconquest.army.dao;

import fr.warhammerchaosandconquest.army.model.Unit;

import java.util.List;

public interface UnitDao {
    public List<Unit> findAll();
    public Unit findById(int id);
    public Unit save(Unit unit);
}
