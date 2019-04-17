package com.example.demo.mapper;

import com.example.demo.model.User;

import java.util.List;


public interface UserMapper {

    List<User> getAll();

    User getOne(long id);

    void insert(User user);

    void update(User user);

    void delete(long id);

}
