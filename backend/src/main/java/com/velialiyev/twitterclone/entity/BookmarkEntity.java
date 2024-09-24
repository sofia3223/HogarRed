package com.velialiyev.twitterclone.entity;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;



@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public class BookmarkEntity extends BaseSingleActionEntity{
}
