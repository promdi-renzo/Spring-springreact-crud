package com.renzothenoob.democrud.services;

import com.renzothenoob.democrud.entity.User;


import java.util.List;

public interface UserService {

    List<User> getAllUser();
    List<User> postUser(User user);
    List<User> putUser(User user);
    List<User> deleteUser(User user);
}
