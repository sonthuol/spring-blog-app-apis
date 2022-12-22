package com.blog.blogappapis.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.blogappapis.entities.User;
import com.blog.blogappapis.payloads.UserDto;
import com.blog.blogappapis.repositories.UserRepository;
import com.blog.blogappapis.services.UserService;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = this.dtoToUser(userDto);
        User savUser = this.userRepository.save(user);
        return this.userToDto(savUser);
    }

    @Override
    public void deleteUser(Integer userId) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<UserDto> getAllUsers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserDto getUserById(Integer userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserDto update(UserDto userDto, Integer userId) {
        // TODO Auto-generated method stub
        return null;
    }

    private User dtoToUser(UserDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setPassword(dto.getPassword());
        user.setEmail(dto.getEmail());
        user.setAbout(dto.getAbout());
        return user;
    }

    private UserDto userToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setPassword(user.getPassword());
        userDto.setEmail(user.getEmail());
        userDto.setAbout(user.getAbout());
        return userDto;
    }

}
