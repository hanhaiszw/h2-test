package com.example.h2test.dao;

import com.example.h2test.bo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * create by sunzhongwei on 2020/04/22
 * Desc:
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
