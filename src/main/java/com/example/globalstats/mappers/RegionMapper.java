package com.example.globalstats.mappers;

import com.example.globalstats.entities.Region;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RegionMapper {
    @Select("SELECT * FROM regions")
    List<Region> getAllRegions();
}
