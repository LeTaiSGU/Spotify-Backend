package com.spotify.spotify_backend.repository;

import com.spotify.spotify_backend.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);
}
