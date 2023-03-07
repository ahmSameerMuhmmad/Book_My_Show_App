package com.example.Book_My_Show_App.Convertors;

import com.example.Book_My_Show_App.EntryDTOs.TicketEntryDTO;
import com.example.Book_My_Show_App.Models.Ticket;

public class TicketConvertor {
    public static Ticket convertDtoToEntity(TicketEntryDTO ticketEntryDTO){
        return new Ticket();
    }
}
