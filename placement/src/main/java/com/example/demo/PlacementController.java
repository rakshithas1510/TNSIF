package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/placements")
public class PlacementController {

    @Autowired
    private PlacementService service;

    // ADD Placement
    @PostMapping("/add")
    public String add(@RequestBody Placement placement) {
        service.add(placement);
        return "Placement added successfully";
    }

    // GET All Placements
    @GetMapping("/all")
    public List<Placement> getAll() {
        return service.listAll();
    }

    // GET Placement by ID
    @GetMapping("/{id}")
    public Placement getById(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    // UPDATE Placement
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody Placement placement, @PathVariable("id") Long id) {
        try {
            service.getById(id); // Check if placement exists
            placement.setId(id);
            service.save(placement);
            return new ResponseEntity<>("Placement updated successfully", HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>("Placement not found", HttpStatus.NOT_FOUND);
        }
    }

    // DELETE Placement
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.delete(id);
        return "Placement deleted successfully";
    }
}
