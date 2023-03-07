package com.example.Book_My_Show_App.Models;


import com.example.Book_My_Show_App.Genres.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TheaterSeats")
public class TheaterSeats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String seatNumber;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;


    @ManyToOne
    @JoinColumn
    private Theater theater;
}
