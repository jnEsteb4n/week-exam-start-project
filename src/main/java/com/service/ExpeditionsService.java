package com.service;

import com.example.model.Expedition;

public class ExpeditionsService {
    private ExpedtionsRepository expeditionsRepository;

    public ExpeditionsService(ExpeditionsRepository expeditionsRepository) {
        this.expeditionsRepository = expeditionsRepository;
    }

    public void addExpedition(Expedition expedition) {
        expeditionsRepository.save(expedition);
    }

    public Collection<Expedition> getExpeditions() {
        return expeditionsRepository.findAll();
    }
}
