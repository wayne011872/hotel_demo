package com.wayne011872.side_project.hotel_demo.dao.mon;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "booking_list")
public class Hotel {
    public Hotel(@NonNull String name, String location, String score, float stars, String review_count, @NonNull String url, String ufi, String hotel_country_code, String hotel_id, String accommodation_type_id) {
        this.name = name;
        this.location = location;
        this.score = score;
        this.stars = stars;
        this.review_count = review_count;
        this.url = url;
        this.ufi = ufi;
        this.hotel_country_code = hotel_country_code;
        this.hotel_id = hotel_id;
        this.accommodation_type_id = accommodation_type_id;
    }

    @Id
    private String id;
    @NonNull
    private String name;
    private String location;
    private String score;
    private String review_count;
    private float stars;
    @NonNull
    private String url;
    private String ufi;
    private String hotel_id;
    private String hotel_country_code;
    private String accommodation_type_id;
}
