package com.weather.weatherforecastingapplication;
import jakarta.persistence.*;
@Entity
@Table(name="weatherdetails")

public class weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String imgurl;
    private String city;
    private String location;
    private double temperature;
    private String name;
    private double wind;
    private String time;
    public weather(){}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public double getTemperature(){
        return temperature;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
     public double getWind(){
        return wind;
    }
    public void setWind(double wind){
        this.wind = wind;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time = time;
    }
     public String getImgurl(){
        return imgurl;
    }
    public void setImgurl(String imgurl){
        this.imgurl = imgurl;
    }
    
}
