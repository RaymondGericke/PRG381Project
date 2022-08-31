package com.project.PRG381Project.dao;

import com.project.PRG381Project.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("fakeDao")
public class FakeUserDataAccessService implements UserDao {

    private static List<User> DB = new ArrayList<>();
    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id, user.getName(), user.getAddress(), user.getEmail(), user.getPassword()));
        return 1;
    }

    @Override
    public List<User> selectAllUsers() {
        return DB;
    }

    @Override
    public Optional<User> selectUserByID(UUID id) {
        return DB.stream().filter(user -> user.getId().equals(id)).findFirst();
    }
    @Override
    public boolean loginUser(User user, String givenPassword) {
        User userLog = DB.stream().filter(user1 -> user1.getId().equals(user.getId())).findFirst().get();
        return Objects.equals(userLog.getPassword(), givenPassword);
    }
    @Override
    public boolean loginAdmin(String givenPassword) {
        User userLog = DB.stream().filter(user1 -> user1.getId().equals("Admin")).findFirst().get();
        return Objects.equals(userLog.getPassword(), givenPassword);
    }

    @Override
    public int deleteUserByID(UUID id) {
        Optional<User> userMaybe = selectUserByID(id);
        if (userMaybe.isEmpty()){
            return 0;
        }
        DB.remove(userMaybe.get());
        return 1;
    }

    @Override
    public int updatePersonByID(UUID id, User userUpdate) {
        return selectUserByID(id)
                .map(user1 -> {
                    int indexOfUserToUpdate = DB.indexOf(user1);
                    if (indexOfUserToUpdate >= 0){
                        DB.set(indexOfUserToUpdate, new User(id, userUpdate.getName(), userUpdate.getAddress(), userUpdate.getEmail(), userUpdate.getPassword()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
