package com.weather.weatherforecastingapplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<weather,Integer>{

    
} 
