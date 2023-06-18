package com.Logate.SpringBootVjezba.domaci.controllers;


import com.Logate.SpringBootVjezba.domaci.Movie;
import com.Logate.SpringBootVjezba.domaci.dto.MovieDTO;
import com.Logate.SpringBootVjezba.domaci.services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/movies/")
public class MovieController {

    @Autowired
    private MovieServices movieServices;

    @Autowired
    private Movie movie;

    @GetMapping()
    public ResponseEntity<List<MovieDTO>> getAllMovies(){
        List<MovieDTO> movies = movieServices.getAllMovies();
        return new ResponseEntity(movies, HttpStatus.OK);
    }

    @GetMapping(value="{id}")
    public ResponseEntity<MovieDTO> getMovieById(@PathVariable Integer id){
        MovieDTO movie = movieServices.getMovieById(id);
        if(movie != null) {
            return new ResponseEntity(movie, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<MovieDTO> createMovie(@RequestBody MovieDTO movieCreated) {
        MovieDTO movie = movieServices.createMovie(movieCreated);
        return new ResponseEntity<>(movieCreated, HttpStatus.OK);
    }
}
