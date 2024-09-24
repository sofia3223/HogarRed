package com.edu.ue.entity;

import jakarta.persistence.Entity;
import java.time.Instant;

@Entity
public class RefreshTokenEntity {
    
    private Long id;
    private String actualizarToken;
  

    
	public RefreshTokenEntity() {
	}
	public RefreshTokenEntity(Long id, String actualizarToken) {
		this.id = id;
		this.actualizarToken = actualizarToken;
	}
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getActualizarToken() {
		return actualizarToken;
	}
	public void setActualizarToken(String actualizarToken) {
		this.actualizarToken = actualizarToken;
	}
	
    @Override
	public String toString() {
		return "RefreshTokenEntity [id=" + id + ", actualizarToken=" + actualizarToken + "]";
	}
	
}
