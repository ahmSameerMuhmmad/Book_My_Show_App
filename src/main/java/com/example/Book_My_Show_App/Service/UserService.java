package com.example.Book_My_Show_App.Service;

import com.example.Book_My_Show_App.Convertors.UserConvertor;
import com.example.Book_My_Show_App.EntryDTOs.UserEntryDTO;
import com.example.Book_My_Show_App.Models.User;
import com.example.Book_My_Show_App.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDTO userEntryDTO) throws Exception, NullPointerException{
        User user = UserConvertor.convertDtoToEntity(userEntryDTO);

        userRepository.save(user);
        return "User added Successfully";
    }
}
