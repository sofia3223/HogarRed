package com.edu.ue.entity;

import java.time.Instant;
import jakarta.persistence.Entity;

@Entity
public class TweetEntity {

    private Long id;
    private UserEntity user;
    private String text;
    private Integer replyCounter;
    private Integer retweetCounter;
    private Integer likeCounter;
    private TweetEntity tweet;
    private TweetEntity replies;
    private TweetType type;
    private Instant createdDate;
    
    public TweetEntity() {
    }

    public TweetEntity(Long id, UserEntity user, String text, Integer replyCounter, Integer retweetCounter,
            Integer likeCounter, TweetEntity tweet, TweetType type, Instant createdDate) {
        this.id = id;
        this.user = user;
        this.text = text;
        this.replyCounter = replyCounter;
        this.retweetCounter = retweetCounter;
        this.likeCounter = likeCounter;
        this.tweet = tweet;
        this.type = type;
        this.createdDate = createdDate;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getReplyCounter() {
        return replyCounter;
    }

    public void setReplyCounter(Integer replyCounter) {
        this.replyCounter = replyCounter;
    }

    public Integer getRetweetCounter() {
        return retweetCounter;
    }

    public void setRetweetCounter(Integer retweetCounter) {
        this.retweetCounter = retweetCounter;
    }

    public Integer getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounter(Integer likeCounter) {
        this.likeCounter = likeCounter;
    }

    public TweetEntity getTweet() {
        return tweet;
    }

    public void setTweet(TweetEntity tweet) {
        this.tweet = tweet;
    }

    public TweetEntity getReplies() {
        return replies;
    }

    public void setReplies(TweetEntity replies) {
        this.replies = replies;
    }

    public TweetType getType() {
        return type;
    }

    public void setType(TweetType type) {
        this.type = type;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "TweetEntity [id=" + id + ", user=" + user + ", text=" + text + ", replyCounter=" + replyCounter
                + ", retweetCounter=" + retweetCounter + ", likeCounter=" + likeCounter + ", tweet=" + tweet
                + ", replies=" + replies + ", type=" + type + ", createdDate=" + createdDate + "]";
    }

    
}
