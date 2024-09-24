package com.edu.ue.entity;

import java.time.Instant;
import jakarta.persistence.Entity;

@Entity
public class TweetEntity {

    private Long id;
    private UserEntity usuaruio;
    private String texto;
    private Integer replyCounter;
    private Integer contadorRespuestas;
    private Integer likeContador;
    private TweetEntity tweet;
    private TweetEntity respuestas;
    private TweetType tipo;
   

    public TweetEntity() {
    }

    public TweetEntity(Long id, UserEntity usuaruio, String texto, Integer replyCounter, Integer contadorRespuestas,
            Integer likeContador, TweetEntity tweet, TweetType tipo) {
        this.id = id;
        this.usuaruio = usuaruio;
        this.texto = texto;
        this.replyCounter = replyCounter;
        this.contadorRespuestas = contadorRespuestas;
        this.likeContador = likeContador;
        this.tweet = tweet;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getusuaruio() {
        return usuaruio;
    }

    public void setusuaruio(UserEntity usuaruio) {
        this.usuaruio = usuaruio;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getReplyCounter() {
        return replyCounter;
    }

    public void setReplyCounter(Integer replyCounter) {
        this.replyCounter = replyCounter;
    }

    public Integer getcontadorRespuestas() {
        return contadorRespuestas;
    }

    public void setcontadorRespuestas(Integer contadorRespuestas) {
        this.contadorRespuestas = contadorRespuestas;
    }

    public Integer getLikeContador() {
        return likeContador;
    }

    public void setLikeContador(Integer likeContador) {
        this.likeContador = likeContador;
    }

    public TweetEntity getTweet() {
        return tweet;
    }

    public void setTweet(TweetEntity tweet) {
        this.tweet = tweet;
    }

    public TweetEntity getrespuestas() {
        return respuestas;
    }

    public void setrespuestas(TweetEntity respuestas) {
        this.respuestas = respuestas;
    }

    public TweetType getTipo() {
        return tipo;
    }

    public void setTipo(TweetType tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TweetEntity [id=" + id + ", usuaruio=" + usuaruio + ", texto=" + texto + ", replyCounter="
                + replyCounter
                + ", contadorRespuestas=" + contadorRespuestas + ", likeContador=" + likeContador + ", tweet=" + tweet
                + ", respuestas=" + respuestas + ", tipo=" + tipo + "]";
    }

}
