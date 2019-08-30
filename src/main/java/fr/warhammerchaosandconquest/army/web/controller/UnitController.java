package fr.warhammerchaosandconquest.army.web.controller;

import fr.warhammerchaosandconquest.army.dao.UnitDao;
import fr.warhammerchaosandconquest.army.model.Unit;
import fr.warhammerchaosandconquest.army.model.UnitType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UnitController {

    @Autowired
    private UnitDao unitDao;

    @GetMapping(value = "units")
    public List<Unit> unitsList () {
        return unitDao.findAll();
    }

    @GetMapping(value = "units/{id}")
    public Unit unitDetails (@PathVariable int id) {
        return unitDao.findById(id);
    }

    @PostMapping(value = "units")
    public ResponseEntity saveUnit (@RequestBody Unit unit) {
        Unit unitAdded = unitDao.save(unit);
        if (unitAdded == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(unitAdded.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
