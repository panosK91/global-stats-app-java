package com.example.globalstats.controllers;

import com.example.globalstats.entities.Country;
import com.example.globalstats.entities.CountryStats;
import com.example.globalstats.services.CountryService;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    // Fetch name, area, and country_code2 of all countries
    @GetMapping("/ordered")
    public List<Country> getAllCountriesOrdered() {
        return countryService.getAllCountriesOrdered();
    }

    // Get spoken languages of a country
    @GetMapping("/{countryCode2}/languages")
    public List<String> getLanguagesByCountryCode2(@PathVariable String countryCode2) {
        return countryService.getLanguagesByCountryCode2(countryCode2);
    }

    // Fetch countries with max GDP per population ratio
    @GetMapping("/max-gdp-per-population")
    public List<CountryStats> getMaxGDPPerPopulation() {
        return countryService.getMaxGDPPerPopulation();
    }

    @GetMapping("/search")
    public List<CountryStats> searchCountryStats(
            @RequestParam(required = false) String regionName,
            @RequestParam(required = false, defaultValue = "0") Integer fromYear,
            @RequestParam(required = false) Integer toYear) {

        // If toYear is null, set it to the current year
        if (toYear == null) {
            toYear = Year.now().getValue();  // Get the current year
        }

        return countryService.searchCountryStats(regionName, fromYear, toYear);
    }
}
