package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository repo;

    // ADD
    public void add(Placement placement) {
        repo.save(placement);
    }

    // GET ALL
    public List<Placement> listAll() {
        return repo.findAll();
    }

    // GET BY ID
    public Placement getById(Long id) {
        return repo.findById(id).orElseThrow(
                () -> new NoSuchElementException("Placement not found with ID: " + id)
        );
    }

    // SAVE / UPDATE
    public Placement save(Placement placement) {
        return repo.save(placement);
    }

    // DELETE
    public void delete(Long id) {
        repo.deleteById(id);
    }
}