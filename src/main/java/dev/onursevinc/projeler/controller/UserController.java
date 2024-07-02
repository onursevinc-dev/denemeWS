package dev.onursevinc.projeler.controller;

import dev.onursevinc.projeler.entity.UserEntity;
import dev.onursevinc.projeler.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserEntity> getAllUser(){
        return  userService.getAllUser();
    }

    @GetMapping("/{userId}")
    public UserEntity findUserById(@PathVariable("userId") String userId){
        return userService.findUserById(userId);
    }

    @DeleteMapping("/{userId}")
    public String deleteUserById(@PathVariable("userId") String userId){
        return userService.deleteUserById(userId);
    }

    @PostMapping
    public UserEntity saveUser(@RequestBody UserEntity request){
        return userService.saveUser(request);
    }

    @PostMapping("/getUserId")
    public UserEntity getUserById(@RequestBody Map<String,String> request){
        String userId = request.get("userId");
        return userService.getUserById(userId);
    }



//
//    @PutMapping
//    @DeleteMapping
}
