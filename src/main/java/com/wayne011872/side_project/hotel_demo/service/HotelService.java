package com.wayne011872.side_project.hotel_demo.service;

import com.wayne011872.side_project.hotel_demo.repository.HotelRepo;
import com.wayne011872.side_project.hotel_demo.dao.mon.Hotel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelService {
    private final HotelRepo hotelRepo;

    public List<Hotel> getAllHotels() {
        return hotelRepo.findAll();
    }
}
