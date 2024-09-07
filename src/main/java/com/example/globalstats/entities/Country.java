package com.example.globalstats.entities;

public class Country {
    private Long countryId;
    private String name;
    private String countryCode2;
    private String countryCode3;
    private String area;
    private String nationalDay;
    private Long regionId;

    // Getters and Setters

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNationalDay() {
        return nationalDay;
    }

    public void setNationalDay(String nationalDay) {
        this.nationalDay = nationalDay;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }
}
