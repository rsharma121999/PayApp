package com.rishabh.userservice.Repository;

import com.rishabh.userservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

