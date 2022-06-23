package com.sunglowsys.service;

import com.sunglowsys.domain.Hotel;
import com.sunglowsys.repository.HotelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HotelServiceImpl implements HotelService{

    private final Logger logger = LoggerFactory.getLogger(HotelServiceImpl.class);

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel createHotel(Hotel hotel) {
        logger.debug("request to save Hotel :");
        Hotel result = hotelRepository.save(hotel);

        return result;
    }

    @Override
    public Hotel updateHotel(Hotel hotel,Long id) {
        logger.debug("request to update Hotel:");
        Hotel hotel1 = hotelRepository.getById(id);
        hotel1.setHotelType(hotel.getHotelType());
        return hotelRepository.save(hotel1);
    }

    @Override
    public List<Hotel> findAll() {
        logger.debug("request to findAll :");
        return hotelRepository.findAll();
    }
}
