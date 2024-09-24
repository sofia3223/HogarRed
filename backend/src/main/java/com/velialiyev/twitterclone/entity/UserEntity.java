package com.velialiyev.twitterclone.entity;

import jakarta.persistence.Entity;

@Entity
public class UserEntity {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String bannerPicturePath;
    private String profilePicturePath;
    private String bio;
    private String location;
    private String personalWebsite;
    private String birthDate;

    public UserEntity() {
    }

    public UserEntity(Long id, String firstName, String lastName, String username, String email, String password,
            String bannerPicturePath, String profilePicturePath, String bio, String location, String personalWebsite,
            String birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.bannerPicturePath = bannerPicturePath;
        this.profilePicturePath = profilePicturePath;
        this.bio = bio;
        this.location = location;
        this.personalWebsite = personalWebsite;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBannerPicturePath() {
        return bannerPicturePath;
    }

    public void setBannerPicturePath(String bannerPicturePath) {
        this.bannerPicturePath = bannerPicturePath;
    }

    public String getProfilePicturePath() {
        return profilePicturePath;
    }

    public void setProfilePicturePath(String profilePicturePath) {
        this.profilePicturePath = profilePicturePath;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPersonalWebsite() {
        return personalWebsite;
    }

    public void setPersonalWebsite(String personalWebsite) {
        this.personalWebsite = personalWebsite;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "UserEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
                + ", email=" + email + ", password=" + password + ", bannerPicturePath=" + bannerPicturePath
                + ", profilePicturePath=" + profilePicturePath + ", bio=" + bio + ", location=" + location
                + ", personalWebsite=" + personalWebsite + ", birthDate=" + birthDate + "]";
    }

}
