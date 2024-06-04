package com.wayne011872.side_project.hotel_demo.repository;

import com.wayne011872.side_project.hotel_demo.dao.mon.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends MongoRepository<Hotel, String> {
}
