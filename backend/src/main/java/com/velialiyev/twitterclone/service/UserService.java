package com.velialiyev.twitterclone.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.velialiyev.twitterclone.dto.UserDto;
import com.velialiyev.twitterclone.entity.UserEntity;
import com.velialiyev.twitterclone.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void savePicture(MultipartFile picture, String username, String pictureDirectory) {

        String userFolder = "/uploads/" + username;
        // Reemplazo de FilenameUtils para obtener la extensión del archivo
        String pictureName = "/" + username + "." + picture.getOriginalFilename().substring(picture.getOriginalFilename().lastIndexOf(".") + 1);
        File directory = new File(userFolder + pictureDirectory);

        // Crear el directorio si no existe
        if (!directory.exists()) {
            directory.mkdirs();
        }

        try {
            byte[] profilePictureBytes = picture.getBytes();
            Path picturePath = Paths.get(directory.getPath() + pictureName);

            // Reemplazo de FileUtils.cleanDirectory
            Files.walk(directory.toPath())
                .map(Path::toFile)
                .forEach(File::delete);

            // Guardar la imagen en el sistema de archivos
            Files.write(picturePath, profilePictureBytes);

            // Buscar el usuario en la base de datos
            UserEntity userEntity = this.userRepository.findByUsername(username).orElseThrow();

            // Actualizar la ruta de la imagen de perfil o banner en la entidad del usuario
            if (pictureDirectory.equals("/profilePicture")) {
                userEntity.setProfilePicturePath(picturePath.toAbsolutePath().toString());
            } else if (pictureDirectory.equals("/bannerPicture")) {
                userEntity.setBannerPicturePath(picturePath.toAbsolutePath().toString());
                System.out.println("PATH : " + picturePath.toAbsolutePath());
            }

            // Guardar la entidad actualizada
            this.userRepository.save(userEntity);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public UserDto getUser(String username) {
        // Buscar al usuario en la base de datos
        UserEntity user = this.userRepository.findByUsername(username).orElseThrow();

        // Construir y retornar el DTO del usuario
        UserDto userDto = UserDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .username(user.getUsername())
                .bio(user.getBio())
                .location(user.getLocation())
                .personalWebsite(user.getPersonalWebsite())
                .birthDate(user.getBirthDate())
                .build();

        return userDto;
    }

    public ByteArrayResource getPicture(String username, String directory) {
        // Obtener la ruta de la imagen
        Path picturePath = this.fetchPicturePath(username, directory);
        try {
            // Leer la imagen y retornarla como ByteArrayResource
            ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(picturePath));
            return resource;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Path fetchPicturePath(String username, String directory) {
        // Buscar al usuario en la base de datos
        UserEntity user = this.userRepository.findByUsername(username).orElseThrow();
        Path picturePath = null;

        // Obtener la ruta correcta según el tipo de imagen (perfil o banner)
        if (directory.equals("/profilePicture")) {
            picturePath = Paths.get(user.getProfilePicturePath());
        } else if (directory.equals("/bannerPicture")) {
            picturePath = Paths.get(user.getBannerPicturePath());
        }

        return picturePath;
    }

    public void editProfile(UserDto user) {
        // Buscar al usuario en la base de datos
        UserEntity userEntity = this.userRepository.findByUsername(user.getUsername()).orElseThrow();

        // Actualizar los datos del perfil
        userEntity.setFirstName(user.getFirstName());
        userEntity.setBio(user.getBio());
        userEntity.setBirthDate(user.getBirthDate());
        userEntity.setLocation(user.getLocation());
        userEntity.setPersonalWebsite(user.getPersonalWebsite());

        // Guardar la entidad actualizada
        this.userRepository.save(userEntity);
    }
}
