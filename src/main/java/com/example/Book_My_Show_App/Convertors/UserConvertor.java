package com.example.Book_My_Show_App.Convertors;

import com.example.Book_My_Show_App.EntryDTOs.UserEntryDTO;
import com.example.Book_My_Show_App.Models.User;

public class UserConvertor {

    //Static is kept to avoid calling it via objects/instances
    public static User convertDtoToEntity(UserEntryDTO userEntryDTO){

        return User.builder().age(userEntryDTO.getAge()).address(userEntryDTO.getAddress())
                .email(userEntryDTO.getEmail()).mobileNumber(userEntryDTO.getMobileNumber()).name(userEntryDTO.getName()).build();
    }

}
