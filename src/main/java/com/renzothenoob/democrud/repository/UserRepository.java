package com.renzothenoob.democrud.repository;

import com.renzothenoob.democrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}
