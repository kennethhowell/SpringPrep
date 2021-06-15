package com.codeup.demoblog.daos;

import com.codeup.demoblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);


}
