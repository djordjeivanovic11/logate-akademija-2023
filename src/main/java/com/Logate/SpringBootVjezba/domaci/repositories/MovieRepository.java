package com.Logate.SpringBootVjezba.domaci.repositories;

import com.Logate.SpringBootVjezba.domaci.dto.MovieDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {


    public List<MovieDTO> getAllMovies() {
        List<MovieDTO> listOfMovies = new ArrayList<>();
        MovieDTO movie1 = new MovieDTO(1, "Fast and Furious", "dobar film", "action");
        MovieDTO movie2 = new MovieDTO(2, "Fast and Furious 2", "bolji film", "action");
        MovieDTO movie3 = new MovieDTO(3, "Fast and Furious 3", "najbolji film", "action");
        MovieDTO movie4 = new MovieDTO(4, "Fast and Furious 4", "vrh film", "action");
        listOfMovies.add(movie1);
        listOfMovies.add(movie2);
        listOfMovies.add(movie3);
        listOfMovies.add(movie4);
        return listOfMovies;
    }

    public MovieDTO getMovieById(Integer id) {
        List<MovieDTO> movies = getAllMovies();
        for(MovieDTO movie : movies) {
            if (movie.getId() == id){
                return movie;
            }
        }
        return null;

    }

    public MovieDTO createUser(MovieDTO movieCreated) {
        return new MovieDTO(5, "Fast and Furious 5", "predobar film", "action");
    }
}
