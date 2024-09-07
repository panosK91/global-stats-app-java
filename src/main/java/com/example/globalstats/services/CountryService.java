package com.example.globalstats.services;

import com.example.globalstats.entities.Country;
import com.example.globalstats.entities.CountryStats;
import com.example.globalstats.mappers.CountryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final CountryMapper countryMapper;

    public CountryService(CountryMapper countryMapper) {
        this.countryMapper = countryMapper;
    }

    public List<Country> getAllCountriesOrdered() {
        return countryMapper.getAllCountriesOrdered();
    }

    public List<String> getLanguagesByCountryCode2(String countryCode2) {
        return countryMapper.getLanguagesByCountryCode2(countryCode2);
    }

    public List<CountryStats> getMaxGDPPerPopulation() {
        return countryMapper.getMaxGDPPerPopulation();
    }

    public List<CountryStats> searchCountryStats(String regionName, int fromYear, int toYear) {
        return countryMapper.searchCountryStats(regionName, fromYear, toYear);
    }
}
