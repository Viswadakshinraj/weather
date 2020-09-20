package io.spring.weatherapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.spring.weatherapi.entity.WeatherData;
import io.spring.weatherapi.service.WeatherService;

@RestController
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	@PostMapping("/weather")
	public ResponseEntity<?> saveWeather(@RequestBody WeatherData weatherData) {
		WeatherData weather=weatherService.saveWeather(weatherData);
		return ResponseEntity.status(HttpStatus.CREATED).body(weather);
		
	}
	
	
	@GetMapping("/weather")
	public ResponseEntity<?> getWeather() {
		List<WeatherData> weather=weatherService.getWeather();
		return ResponseEntity.status(HttpStatus.OK).body(weather);
		
	}
	
	@GetMapping("/weather/{id}")
	public ResponseEntity<?> getWeatherById(@PathVariable int id) {
		 Optional<Optional<WeatherData>> finalResult=Optional.ofNullable(weatherService.getWeatherById(id)); 
		 if(finalResult.isPresent()) {
			 return ResponseEntity.status(HttpStatus.OK).body(finalResult);			 
		 }else {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }
		 
		
	}

}
