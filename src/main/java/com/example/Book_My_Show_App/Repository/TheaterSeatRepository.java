package com.example.Book_My_Show_App.Repository;

import com.example.Book_My_Show_App.Models.TheaterSeats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterSeatRepository extends JpaRepository<TheaterSeats,Integer> {
}
