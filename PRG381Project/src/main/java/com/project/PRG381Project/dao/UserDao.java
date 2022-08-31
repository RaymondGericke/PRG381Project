package com.project.PRG381Project.dao;

import com.project.PRG381Project.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {
    int insertUser(UUID id, User user);

    default  int insertUser(User user){
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    List<User> selectAllUsers();

    Optional<User> selectUserByID(UUID id);

    boolean loginUser(User user, String givenPassword);
    boolean loginAdmin(String givenPassword);

    int deleteUserByID(UUID id);

    int updatePersonByID(UUID id, User user);
}
