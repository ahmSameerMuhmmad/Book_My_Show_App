package com.example.Book_My_Show_App.Convertors;

import com.example.Book_My_Show_App.EntryDTOs.TheaterEntryDTO;
import com.example.Book_My_Show_App.Models.Theater;

public class TheaterConvertor {

    public static Theater convertDtoToEntity(TheaterEntryDTO theaterEntryDTO){
        return Theater.builder().location(theaterEntryDTO.getLocation()).name(theaterEntryDTO.getName()).build();
    }
}

