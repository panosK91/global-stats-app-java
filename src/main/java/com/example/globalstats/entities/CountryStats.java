package com.example.globalstats.entities;

public class CountryStats {
    private String continentName;
    private String regionName;
    private String countryName;
    private String countryCode3;
    private int year;
    private int population;
    private double gdp;
    private  double gdpPerPopulation;

    // Getters and Setters
    public String getRegionName() {
        return regionName;
    }

    public void getRegionName(String regionName) {
        this.regionName = regionName;
    }

    // Getters and Setters
    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    // Getters and Setters
    public String getCountryName() {
        return countryName;
    }

    public void setCountryId(String countryName) {
        this.countryName = countryName;
    }

    // Getters and Setters
    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public double getGdpPerPopulation() {
        return gdpPerPopulation;
    }

    public void setGdpPerPopulation(double gdpPerPopulation) {
        this.gdpPerPopulation = gdpPerPopulation;
    }
}
