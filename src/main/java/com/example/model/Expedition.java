package com.example.model;

public class Expedition {
    private int id;
    private String name;
    private String code;
    private String region;
    private String baseCamp;
    private String leader;
    private String startDate;
    private String endDate;
    private String state;

    public Expedition(int id, String name, String code, String region, String baseCamp, String leader, String startDate,
            String endDate, String state) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.region = region;
        this.baseCamp = baseCamp;
        this.leader = leader;
        this.startDate = startDate;
        this.endDate = endDate;
        this.state = state;
    }

}
