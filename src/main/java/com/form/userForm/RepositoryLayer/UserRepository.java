package com.form.userForm.RepositoryLayer;

import com.form.userForm.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
