package com.wayne011872.side_project.hotel_demo.controllers;

import com.wayne011872.side_project.hotel_demo.dao.mon.Hotel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.wayne011872.side_project.hotel_demo.service.HotelService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class HotelController {
    private final HotelService hotelService;
    @PostMapping("/hotels")
    public String create(@RequestBody Hotel hotel) {
        return "execute DB Hotel created";
    }
    @GetMapping("/hotels")
    public List<Hotel> getAll() {
        List<Hotel> hotels= hotelService.getAllHotels();
        return hotels;
    }
    @PutMapping("/hotels/{id}")
    public String update(@PathVariable int id,@RequestBody Hotel hotel) {
        return "execute DB Hotel updated";
    }
    @DeleteMapping("/hotels/{id}")
    public String delete(@PathVariable int id) {
        return "execute DB Hotel deleted";
    }
}
