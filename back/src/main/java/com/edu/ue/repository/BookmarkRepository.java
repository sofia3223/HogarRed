package com.edu.ue.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ue.entity.BookmarkEntity;
import com.edu.ue.entity.TweetEntity;
import com.edu.ue.entity.UserEntity;

public interface BookmarkRepository extends JpaRepository<BookmarkEntity, Long> {

    Optional<BookmarkEntity> findByUserAndTweet(UserEntity usuario, TweetEntity tweet);

    Optional<List<BookmarkEntity>> findAllByUser(UserEntity usuario);

}
