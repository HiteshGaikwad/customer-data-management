package com.form.userForm.ServiceLayer;

import com.form.userForm.Entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    User createUser(User user);
    void deleteUser(Long userId);
    User updateUser(Long userId, User user);
}
