package io.datajek.springbootdemo.recommenderapi;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

public class Movie {
    int id;
    String name;
    double rating;
    Seat seat;

    public Movie() {
    }

    public Movie(int id, String name, double rating, Seat seat) {
        super();
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.seat = seat;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public Seat getSeat() {
        return seat;
    }


    @Override
    public String toString() {
        return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
    }


}