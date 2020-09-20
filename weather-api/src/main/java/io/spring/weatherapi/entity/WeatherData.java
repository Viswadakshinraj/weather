package io.spring.weatherapi.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="weather_data")
public class WeatherData {
	
	@Id
	@GeneratedValue
	private int id;
	private String date;
	private float lat;
	private float lon;
	private String city;
	private String state;
	private float[] temperatures;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(Date date) {
		SimpleDateFormat DateFor = new SimpleDateFormat("YYYY-MM-dd");
		String stringDate = DateFor.format(date);
		this.date = stringDate;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public float[] getTemperatures() {
		return temperatures;
	}
	public void setTemperatures(float[] temperatures) {
		this.temperatures = temperatures;
	}

}
