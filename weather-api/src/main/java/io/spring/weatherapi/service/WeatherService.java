package io.spring.weatherapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.weatherapi.entity.WeatherData;
import io.spring.weatherapi.repository.WeatherRepository;

@Service
public class WeatherService {

	@Autowired
	private WeatherRepository weatherRepository;
	
	public WeatherData saveWeather(WeatherData weatherData) {
		return weatherRepository.save(weatherData);
	}
	
	public List<WeatherData> getWeather() {
		return weatherRepository.findAll();
		
	}
	public Optional<WeatherData> getWeatherById(int id) {
		Optional<WeatherData> result=weatherRepository.findById(id);
		if(result.isPresent()) {
			return result;
		}else {
			return null;
		}	
	}

}
