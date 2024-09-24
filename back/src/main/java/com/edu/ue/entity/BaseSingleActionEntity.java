package com.edu.ue.entity;


import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseSingleActionEntity {
    
    
    private Long id;
    private UserEntity usuario;
    private TweetEntity tweet;

	public BaseSingleActionEntity() {
	}
    
	public BaseSingleActionEntity(Long id, UserEntity usuario, TweetEntity tweet) {
		this.id = id;
		this.usuario = usuario;
		this.tweet = tweet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UserEntity usuario) {
		this.usuario = usuario;
	}

	public TweetEntity getTweet() {
		return tweet;
	}

	public void setTweet(TweetEntity tweet) {
		this.tweet = tweet;
	}

    @Override
	public String toString() {
		return "BaseSingleActionEntity [id=" + id + ", usuario=" + usuario + ", tweet=" + tweet + "]";
	}
	
}
