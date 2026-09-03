package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Expedition;

public class SightingRepository {
    private List<Sighting> sighting = new ArrayList<>();

    private ExpeditionRepository expeditionsRepository;

    public SightingRepository(ExpeditionsRepository expeditionsRepository) {
        this.expeditionsRepository = expeditionsRepository;
    }

    public List<Sighting> findAll() {
        return sighting;
    }

    public void save(Sighting sighting) {
        sighting.add(sighting);
    }
}