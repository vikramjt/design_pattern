package com.vikram.designpatterns.dao;

import java.util.Optional;

public interface UserDao {
    void save(User user);
    Optional<User> findById(int id);
}
