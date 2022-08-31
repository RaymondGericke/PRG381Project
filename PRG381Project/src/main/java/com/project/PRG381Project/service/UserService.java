package com.project.PRG381Project.service;

import com.project.PRG381Project.dao.UserDao;
import com.project.PRG381Project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("fakeDao") UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    public List<User> getAllUsers(){
        return userDao.selectAllUsers();
    }

    public Optional<User> getUserByID(UUID id){
        return userDao.selectUserByID(id);
    }

    public int deleteUser(UUID id){
        return userDao.deleteUserByID(id);
    }

    public int updateUser(UUID id, User newUser){
        return userDao.updatePersonByID(id, newUser);
    }
}
