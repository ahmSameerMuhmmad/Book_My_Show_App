package com.example.Book_My_Show_App.Convertors;

import com.example.Book_My_Show_App.EntryDTOs.MovieEntryDTO;
import com.example.Book_My_Show_App.Models.Movie;

public class MovieConvertor {

    public static Movie convertDtoToEntity(MovieEntryDTO movieEntryDTO){
        return Movie.builder().movieName(movieEntryDTO.getMovieName()).genre(movieEntryDTO.getGenre()).language(movieEntryDTO.getLanguage()).duration(movieEntryDTO.getDuration())
                .rating(movieEntryDTO.getRating()).duration(movieEntryDTO.getDuration()).build();

    }
}