package com.gairola.login.service;

import java.util.List;

import com.gairola.login.dto.UserDto;
import com.gairola.login.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
