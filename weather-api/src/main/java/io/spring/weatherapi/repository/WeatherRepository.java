package io.spring.weatherapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.spring.weatherapi.entity.WeatherData;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherData, Integer>{

}
