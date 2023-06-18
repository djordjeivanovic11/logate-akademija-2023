package com.Logate.SpringBootVjezba.domaci.services;

import com.Logate.SpringBootVjezba.domaci.dto.MovieDTO;
import com.Logate.SpringBootVjezba.domaci.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServices {

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieDTO> getAllMovies() {
        return movieRepository.getAllMovies();
    }

    public MovieDTO getMovieById(Integer id) {
        return movieRepository.getMovieById(id);
    }

    public MovieDTO createMovie(MovieDTO movieCreated) {
        return movieRepository.createUser(movieCreated);
    }
}
