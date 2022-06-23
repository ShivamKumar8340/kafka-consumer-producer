package com.sunglowsys.service;

import com.sunglowsys.domain.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface HotelService {
    Hotel createHotel(Hotel hotel);

    Hotel updateHotel(Hotel hotel,Long id);

    List<Hotel> findAll();
}
