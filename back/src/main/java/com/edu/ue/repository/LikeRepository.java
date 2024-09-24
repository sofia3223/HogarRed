package com.edu.ue.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ue.entity.LikeEntity;
import com.edu.ue.entity.TweetEntity;
import com.edu.ue.entity.UserEntity;

public interface LikeRepository extends JpaRepository<LikeEntity, Long> {

    Optional<LikeEntity> findByUserAndTweet(UserEntity usuario, TweetEntity tweet);
    Optional<List<LikeEntity>> findAllByUser(UserEntity usuario);

}
