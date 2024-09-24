package com.edu.ue.entity;

public class UserEntity {

    private Long id;
    private String nombre;
    private String apellido;
    private String usuario;
    private String correo;
    private String contraseña;
    private String bannerImagen;
    private String perfilImagen;
    private String bio;
    private String ubicacion;
    private String sitioWebPersonal;
    private String fechaNacimiento;

    public UserEntity() {
    }

    public UserEntity(Long id, String nombre, String apellido, String usuario, String correo, String contraseña,
            String bannerImagen, String perfilImagen, String bio, String ubicacion, String sitioWebPersonal,
            String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.bannerImagen = bannerImagen;
        this.perfilImagen = perfilImagen;
        this.bio = bio;
        this.ubicacion = ubicacion;
        this.sitioWebPersonal = sitioWebPersonal;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long  getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getBannerImagen() {
        return bannerImagen;
    }

    public void setBannerImagen(String bannerImagen) {
        this.bannerImagen = bannerImagen;
    }

    public String getPerfilImagen() {
        return perfilImagen;
    }

    public void setPerfilImagen(String perfilImagen) {
        this.perfilImagen = perfilImagen;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getSitioWebPersonal() {
        return sitioWebPersonal;
    }

    public void setSitioWebPersonal(String sitioWebPersonal) {
        this.sitioWebPersonal = sitioWebPersonal;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "UserEntity [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario
                + ", correo=" + correo + ", contraseña=" + contraseña + ", bannerImagen=" + bannerImagen
                + ", perfilImagen=" + perfilImagen + ", bio=" + bio + ", ubicacion=" + ubicacion + ", sitioWebPersonal="
                + sitioWebPersonal + ", fechaNacimiento=" + fechaNacimiento + "]";
    }
}
