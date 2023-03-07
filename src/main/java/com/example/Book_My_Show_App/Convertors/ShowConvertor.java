package com.example.Book_My_Show_App.Convertors;

import com.example.Book_My_Show_App.EntryDTOs.ShowEntryDTO;
import com.example.Book_My_Show_App.Models.Show;

public class ShowConvertor {
    public static Show convertDtoToEntity(ShowEntryDTO showEntryDTO) {
        return Show.builder()
                .showDate(showEntryDTO.getLocalDate())
                .showTime(showEntryDTO.getLocalTime())
                .showType(showEntryDTO.getShowType())
                .build();
    }
}
