package com.sunglowsys.controller;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.service.HotelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelResource {
    private final HotelService hotelService;

    private final Logger logger = LoggerFactory.getLogger(HotelResource.class);

    public HotelResource(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping("/Hotels")
   public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelService.createHotel(hotel);
    }

    @PutMapping("/Hotels/{id}")
    public Hotel updateHotel( @RequestBody Hotel hotel,@PathVariable("id") Long id ) {

    return hotelService.updateHotel(hotel,id);

    }

    @GetMapping("/Hotels")
    public List<Hotel> getAll() {
    List<Hotel> hotels = hotelService.findAll();
    return hotels;

    }

}
