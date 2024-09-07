package com.example.globalstats.mappers;

import com.example.globalstats.entities.Country;
import com.example.globalstats.entities.CountryStats;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CountryMapper {

    @Select("SELECT name, area, country_code2 AS countryCode2 FROM countries ORDER BY name")
    List<Country> getAllCountriesOrdered();

    @Select("SELECT l.language FROM languages l " +
            "JOIN country_languages cl ON l.language_id = cl.language_id " +
            "JOIN countries c ON c.country_id = cl.country_id " +
            "WHERE c.country_code2 = #{countryCode2}")
    List<String> getLanguagesByCountryCode2(String countryCode2);

    @Select("SELECT c.name AS countryName, " +
            "c.country_code3 AS countryCode3, " +
            "cs.year, " +
            "cs.population, " +
            "cs.gdp, " +
            "(cs.gdp / cs.population) AS gdpPerPopulation " +  // Include the ratio in the selection
            "FROM countries c " +
            "JOIN country_stats cs ON c.country_id = cs.country_id " +
            "JOIN ( " +
            "    SELECT country_id, " +
            "           MAX(gdp / population) AS max_gdp_per_population " +
            "    FROM country_stats " +
            "    WHERE population > 0 " +  // To avoid division by zero
            "    GROUP BY country_id " +
            ") max_ratio ON cs.country_id = max_ratio.country_id " +
            "AND (cs.gdp / cs.population) = max_ratio.max_gdp_per_population " +
            "ORDER BY gdpPerPopulation DESC;")  // Order by the ratio in descending order
    List<CountryStats> getMaxGDPPerPopulation();

    @Select("SELECT c.name AS continentName, " +
            "r.name AS regionName, " +
            "co.name AS countryName, " +
            "cs.year, cs.population, cs.gdp " +
            "FROM continents c " +
            "JOIN regions r ON c.continent_id = r.continent_id " +
            "JOIN countries co ON r.region_id = co.region_id " +
            "JOIN country_stats cs ON co.country_id = cs.country_id " +
            "WHERE (#{regionName} IS NULL OR r.name = #{regionName}) " +  // Filter by region name
            "AND (#{fromYear} IS NULL OR #{toYear} IS NULL OR cs.year BETWEEN #{fromYear} AND #{toYear}) " +  // Year filter
            "ORDER BY cs.year DESC")
    List<CountryStats> searchCountryStats(
            @Param("regionName") String regionName,  // Pass region name as parameter
            @Param("fromYear") Integer fromYear,     // Optional year filter
            @Param("toYear") Integer toYear          // Optional year filter
    );


}
