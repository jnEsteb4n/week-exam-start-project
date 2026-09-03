package com.repository;

import java.util.ArrayList;

import com.example.model.Expedition;

public class ExpeditionsRepository {

    private List<Expedition> expedition = new ArrayList<>();

    private SightingRepository sightingRepository;

    public ExpeditionsRepository(SightingRepository sightingRepository) {
        this.sightingRepository = sightingRepository;
    }

    public List<Expedition> findAll() {
        return expedition;
    }

    public void save(Expedition expedition) {
        expedition.add(expedition);
    }
}
