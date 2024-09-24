package com.edu.ue.entity;

import jakarta.persistence.Entity;
import java.time.Instant;

@Entity
public class RefreshTokenEntity {
    
    private Long id;
    private String actualizarToken;
    private Instant fechaCreacion;

    
	public RefreshTokenEntity() {
	}
	public RefreshTokenEntity(Long id, String actualizarToken, Instant fechaCreacion) {
		this.id = id;
		this.actualizarToken = actualizarToken;
		this.fechaCreacion = fechaCreacion;
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
	public Instant getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Instant fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
    @Override
	public String toString() {
		return "RefreshTokenEntity [id=" + id + ", actualizarToken=" + actualizarToken + ", fechaCreacion="
				+ fechaCreacion + "]";
	}
	
}
