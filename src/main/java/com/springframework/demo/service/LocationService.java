package com.springframework.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Value("#{new Boolean(environment['spring.profiles.active']!='dev')}")
    private boolean isOnsite;

    public LocationService() {
        super();
    }

    public String getLocation() {
        return isOnsite ? "USA" : "India";
    }
}
