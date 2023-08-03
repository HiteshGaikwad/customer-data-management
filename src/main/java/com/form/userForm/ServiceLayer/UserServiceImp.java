package com.form.userForm.ServiceLayer;

import com.form.userForm.Entity.User;
import com.form.userForm.RepositoryLayer.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User updateUser(Long userId, User user) {
        User existingUser = userRepository.findById(userId).orElse(null);
        if (existingUser != null) {
            // Update the user fields if they are not null
            if (user.getFirst_name() != null) {
                existingUser.setFirst_name(user.getFirst_name());
            }
            if (user.getLast_name() != null) {
                existingUser.setLast_name(user.getLast_name());
            }
            if (user.getStreet() != null) {
                existingUser.setStreet(user.getStreet());
            }
            if (user.getAddress() != null) {
                existingUser.setAddress(user.getAddress());
            }
            if (user.getCity() != null) {
                existingUser.setCity(user.getCity());
            }
            if (user.getState() != null) {
                existingUser.setState(user.getState());
            }
            if (user.getEmail() != null) {
                existingUser.setEmail(user.getEmail());
            }
            if (user.getPhone() != null) {
                existingUser.setPhone(user.getPhone());
            }

            return userRepository.save(existingUser);
        }
        return null;
    }
}
