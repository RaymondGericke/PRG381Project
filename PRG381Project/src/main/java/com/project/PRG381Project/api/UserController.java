package com.project.PRG381Project.api;

import com.project.PRG381Project.dao.UserDao;
import com.project.PRG381Project.model.User;
import com.project.PRG381Project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/user")
@RestController
public class UserController {
    @Autowired
    private UserDao repo;
    private final UserService userService;

    @GetMapping("/home")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String viewRegister() {
        return "registerForm";
    }

    @PostMapping("registerUser")
    public String registerUser(User user){
        repo.insertUser(user);
        return "Success";
    }

    @PostMapping("loginUser")
    public boolean loginUser(String username, String password){
        User user1 = repo.selectUserByID(UUID.fromString(username)).get();
        return repo.loginUser(user1, password);
    }

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/showAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(path = "/getUserById/{id}")
    public User getUserById(@PathVariable("id") UUID id){
        return userService.getUserByID(id).orElse(null);
    }

    @DeleteMapping(path = "/deleteUserById/{id}")
    public void deleteUserById(@PathVariable("id") UUID id){
        userService.deleteUser(id);
    }

    @PutMapping(path = "/updateUserById/{id}")
    public void updateUserById(@PathVariable("id") UUID id, @RequestBody User userToUpdate){
        userService.updateUser(id, userToUpdate);
    }
}
