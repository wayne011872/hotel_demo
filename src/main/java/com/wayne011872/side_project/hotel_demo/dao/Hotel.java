package com.wayne011872.side_project.hotel_demo.dao;

import lombok.Data;

@Data
public class Hotel {
    private String name;
    private String location;
    private String score;
    private String review_count;
    private float stars;
    private String url;
}
