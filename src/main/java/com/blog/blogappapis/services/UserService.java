package com.blog.blogappapis.services;

import java.util.List;

import com.blog.blogappapis.payloads.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto update(UserDto userDto, Integer userId);

    UserDto getUserById(Integer userId);

    List<UserDto> getAllUsers();

    void deleteUser(Integer userId);
}
