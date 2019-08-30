package fr.warhammerchaosandconquest.army.dao;

import fr.warhammerchaosandconquest.army.model.Unit;
import fr.warhammerchaosandconquest.army.model.UnitType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UnitDaoImpl implements UnitDao {
    public static List<Unit> units = new ArrayList<>();
    static {
        units.add(new Unit(1, "Maraudeur", UnitType.infantry));
        units.add(new Unit(2, "Rejeton du chaos", UnitType.montruousBeast));
        units.add(new Unit(3, "Chien de guerre du chaos", UnitType.warBeast));
    }
    @Override
    public List<Unit> findAll() {
        return units;
    }

    @Override
    public Unit findById(int id) {
        return units.stream().filter(unit -> unit.getId() == id).findAny().orElse(null);
    }

    @Override
    public Unit save(Unit unit) {
        units.add(unit);
        return unit;
    }
}
