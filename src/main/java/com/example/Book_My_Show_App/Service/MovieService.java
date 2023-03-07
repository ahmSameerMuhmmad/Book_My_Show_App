package com.example.Book_My_Show_App.Service;

import com.example.Book_My_Show_App.Convertors.MovieConvertor;
import com.example.Book_My_Show_App.EntryDTOs.MovieEntryDTO;
import com.example.Book_My_Show_App.Models.Movie;
import com.example.Book_My_Show_App.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieEntryDTO movieEntryDTO){
        Movie movie = MovieConvertor.convertDtoToEntity(movieEntryDTO);
        movieRepository.save(movie);

        return "Movie added Successfully";
    }

}