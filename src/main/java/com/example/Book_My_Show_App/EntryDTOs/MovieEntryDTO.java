package com.example.Book_My_Show_App.EntryDTOs;

import com.example.Book_My_Show_App.Genres.Genre;
import com.example.Book_My_Show_App.Genres.Language;
import lombok.Data;

@Data
public class MovieEntryDTO {

    private String movieName;

    private double rating;

    private double duration;

    private Genre genre;

    private Language language;
}
