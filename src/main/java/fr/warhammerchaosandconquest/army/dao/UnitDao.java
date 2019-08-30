package fr.warhammerchaosandconquest.army.dao;

import fr.warhammerchaosandconquest.army.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnitDao extends JpaRepository<Unit, Integer> {
    Unit findById(int id);
}
