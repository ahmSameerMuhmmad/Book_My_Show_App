package com.example.Book_My_Show_App.EntryDTOs;

import com.example.Book_My_Show_App.Genres.ShowType;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class ShowEntryDTO {

    private LocalDate localDate;

    private LocalTime localTime;

    private ShowType showType;

    private int movieId;

    private int theaterId;

    private int classSeatPrice;

    private int premiumSeatPrice;

}

