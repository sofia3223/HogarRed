package com.edu.ue.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.ue.entity.TweetEntity;
import com.edu.ue.entity.TweetType;
import com.edu.ue.entity.UserEntity;

@Repository
public interface TweetRepository extends JpaRepository<TweetEntity, Long> {

    Optional<List<TweetEntity>> findAllByUserAndType(UserEntity usuario, TweetType type);
    Optional<List<TweetEntity>> findAllByTweetAndType(TweetEntity tweet, TweetType type);
    Optional<List<TweetEntity>> findAllByType(TweetType tipo);

}
