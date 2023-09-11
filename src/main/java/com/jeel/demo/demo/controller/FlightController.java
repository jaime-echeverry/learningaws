package com.jeel.demo.demo.controller;

import com.jeel.demo.demo.model.Flight;
import com.jeel.demo.demo.model.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    FlightRepository flightRepository;

    @GetMapping("/flights")
    public List<Flight> getFlights(){
        return flightRepository.findAll();
    }
}
