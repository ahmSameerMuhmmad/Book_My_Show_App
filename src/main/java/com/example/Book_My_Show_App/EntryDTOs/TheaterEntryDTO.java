package com.example.Book_My_Show_App.EntryDTOs;

import lombok.Data;

@Data
public class TheaterEntryDTO {

    private String name;

    private String location;

    private int classicSeatsCount;

    private int premiumSeatsCount;
}