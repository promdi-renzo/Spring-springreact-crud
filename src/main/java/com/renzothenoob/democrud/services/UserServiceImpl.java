package com.renzothenoob.democrud.services;

import com.renzothenoob.democrud.entity.User;
import com.renzothenoob.democrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {

        return userRepository.findAll();
    }

    @Override
    public List<User> postUser(User user) {

        user.setId(0);

        userRepository.save(user);

        return userRepository.findAll();
    }

    @Override
    public List<User> putUser(User user) {

        userRepository.save(user);
        return userRepository.findAll();
    }

    @Override
    public List<User> deleteUser(User user) {

        userRepository.deleteById(user.getId());
        return userRepository.findAll();
    }
}
