package com.springframework.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OutputService {

    @Value("${app.name}")
    private String name;


    private final GreetingService greetingService;
    private final LocationService locationService;

    public OutputService(GreetingService greetingService, LocationService locationService) {
        this.greetingService = greetingService;
        this.locationService = locationService;
    }

    public void generateOutput() {

        String output = greetingService.getGreeting(name) + ", How's the weather in " +
                locationService.getLocation();
        System.out.println(output) ;
    }

}
