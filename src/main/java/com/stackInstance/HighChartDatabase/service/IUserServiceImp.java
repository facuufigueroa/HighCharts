package com.stackInstance.HighChartDatabase.service;



import com.stackInstance.HighChartDatabase.model.User;
import com.stackInstance.HighChartDatabase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IUserServiceImp {

    @Autowired
    public UserRepository userRepository;

    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }
}
