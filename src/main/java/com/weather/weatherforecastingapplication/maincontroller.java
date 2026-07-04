package com.weather.weatherforecastingapplication;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;


@RestController
@CrossOrigin("*")

public class maincontroller {
    @Autowired
    UserRepository repo;
    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String email, @RequestParam String password) {
        user existing = repo.findByEmail(email);
        if(existing != null){
            return "Mail already exist";
        }
        user u = new user();
        u.setUsername(username);
        u.setEmail(email);
        u.setPassword(password);
        repo.save(u);
        return "Sigup success";
    }
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
      user user = repo.findByEmail(email);
      if(user == null){
        return "User not found";
      }
      if(user.getPassword().equals(password)){
        return "success";
      }
      return "Invalid password";
    }
   @Autowired
   WeatherRepository weatherrepo;
   @GetMapping("/check")
   public weather check(@RequestParam String city, @RequestParam String location, @RequestParam double temperature, @RequestParam String name, @RequestParam double wind, @RequestParam String time, @RequestParam String imgurl) {
    System.out.println("city = " + city);
      System.out.println("location = " + location);
        System.out.println("temperature = " + temperature);
          System.out.println("name = " + name);
            System.out.println("wind = " + wind);
              System.out.println("time = " + time);
                System.out.println("imgurl = " + imgurl);
       weather w = new weather();
       w.setCity(city);
       w.setLocation(location);
       w.setTemperature(temperature);
       w.setName(name);
       w.setWind(wind);
       w.setTime(time);
       w.setImgurl(imgurl);
       return weatherrepo.save(w);
   }
   @GetMapping("/history")
   public List<weather> history() {
       return weatherrepo.findAll();
   }
   

  
    
}
