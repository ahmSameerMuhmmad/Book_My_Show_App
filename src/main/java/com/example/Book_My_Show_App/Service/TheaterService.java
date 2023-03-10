package com.example.Book_My_Show_App.Service;

import com.example.Book_My_Show_App.Convertors.TheaterConvertor;
import com.example.Book_My_Show_App.EntryDTOs.TheaterEntryDTO;
import com.example.Book_My_Show_App.Genres.SeatType;
import com.example.Book_My_Show_App.Models.Theater;
import com.example.Book_My_Show_App.Models.TheaterSeats;
import com.example.Book_My_Show_App.Repository.TheaterRepository;
import com.example.Book_My_Show_App.Repository.TheaterSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {

    @Autowired
    TheaterSeatRepository theaterSeatRepository;

    @Autowired
    TheaterRepository theaterRepository;

    public String addTheater(TheaterEntryDTO theaterEntryDTO) throws Exception{
        Theater theater = TheaterConvertor.convertDtoToEntity(theaterEntryDTO);
        List<TheaterSeats> theaterSeatsList = createTheaterSeats(theaterEntryDTO, theater);
        theater.setTheaterSeatsList(theaterSeatsList);
        theaterRepository.save(theater);
        return "Theater added Successfully";
    }

    private List<TheaterSeats> createTheaterSeats(TheaterEntryDTO theaterEntryDto,Theater theater){
        int numberOfClassicSeats = theaterEntryDto.getClassicSeatsCount();
        int numberOfPremiumSeats = theaterEntryDto.getPremiumSeatsCount();

        List<TheaterSeats> theaterSeatEntityList = new ArrayList<>();

        //Created the classic Seats
        for(int count = 1; count <= numberOfClassicSeats; count++){

            //We need to make a new TheaterSeatEntity
            TheaterSeats theaterSeat = TheaterSeats.builder()
                    .seatType(SeatType.CLASSIC).seatNumber(count+"C")
                    .theater(theater).build();

            theaterSeatEntityList.add(theaterSeat);
        }

        //Create the premium Seats
        for(int count = 1; count <= numberOfPremiumSeats; count++){

            TheaterSeats theaterSeat = TheaterSeats.builder().
                    seatType(SeatType.PREMIUM).seatNumber(count+"P").theater(theater).build();

            theaterSeatEntityList.add(theaterSeat);
        }
        return theaterSeatEntityList;
    }
}