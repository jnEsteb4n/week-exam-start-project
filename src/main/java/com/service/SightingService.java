package com.service;

import java.util.List;

public class SightingService {

    private SightingRepository sightingRepository;
    private ExpeditionsRepository expeditionsRepository;

    public SightingsService(SightingRepository sightingRepository, ExpeditionsRepository expeditionsRepository) {
        this.sightingRepository = sightingRepository;
        this.expeditionsRepository = expeditionsRepository;
    }

    public void addStighting(Sighting sighting) {
        if (expeditionsRepository.existById(sighting.getCourseId())) {
            sightingRepository.save(sighting);
            System.out.println("Sight saved");
        } else {
            System.out.println("Expedition not found");
        }

    }

    public List<Sighting> getSightings() {
        return sightingRepository.findAll();
    }
}
