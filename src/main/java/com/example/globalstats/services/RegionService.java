package com.example.globalstats.services;

import com.example.globalstats.entities.Region;
import com.example.globalstats.mappers.RegionMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    private final RegionMapper regionMapper;

    // Constructor-based dependency injection
    public RegionService(RegionMapper regionMapper) {
        this.regionMapper = regionMapper;
    }

    public List<Region> getAllRegions() {
        return regionMapper.getAllRegions();
    }
}
