package com.example.model;

public class Sighting {
    private int id;
    private String sightingCode;
    private String name;
    private String description;
    private String scientificName;
    private String sightedAt;
    private String location;
    private int quantity;
    private int confidenceLevel;
    private int expeditionId;

    public Sighting(int id, String sightingCode, String name, String description, String scientificName,
            String sightedAt, String location, int quantity, int conficenceLevel, int expeditionId) {
        this.id = id;
        this.sightingCode = sightingCode;
        this.name = name;
        this.description = description;
        this.scientificName = scientificName;
        this.sightedAt = sightedAt;
        this.location = location;
        this.quantity = quantity;
        this.confidenceLevel = conficenceLevel;
        this.expeditionId = expeditionId;
    }

}
