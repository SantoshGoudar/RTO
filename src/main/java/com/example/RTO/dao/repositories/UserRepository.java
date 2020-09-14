package com.example.RTO.dao.repositories;

import java.util.UUID;
import com.example.RTO.dao.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    public User findByPhoneNumber(String phoneNumber);

    public boolean existsUserByPhoneNumber(String phoneNumber);
}
