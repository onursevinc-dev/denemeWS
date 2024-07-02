package dev.onursevinc.projeler.service;

import dev.onursevinc.projeler.entity.UserEntity;
import dev.onursevinc.projeler.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserEntity> getAllUser(){
        return userRepository.findAll();
    }

    public UserEntity findUserById(String userId) {
        return userRepository.findById(userId).get();
    }

    public UserEntity saveUser(UserEntity request) {
        return userRepository.save(request);
    }

    public UserEntity getUserById(String userId) {
        return userRepository.findById(userId).get();
    }

    public String deleteUserById(String userId) {
        try {
            userRepository.deleteById(userId);
            return "Silindi";
        }catch (Exception e){
            return "Silinemedi";
        }
    }
}
