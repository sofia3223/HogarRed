package com.edu.ue.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ue.entity.RetweetEntity;
import com.edu.ue.entity.TweetEntity;
import com.edu.ue.entity.UserEntity;

public interface RetweetRepository extends JpaRepository<RetweetEntity, Long> {

     Optional<RetweetEntity> findByUserAndTweet(UserEntity user, TweetEntity tweet);
    Optional<RetweetEntity> findAllByTweet(TweetEntity tweet);
    Optional<List<RetweetEntity>> findAllByUser(UserEntity user);


}
