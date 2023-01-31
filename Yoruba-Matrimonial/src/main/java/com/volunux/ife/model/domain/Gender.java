package com.volunux.ife.model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "gender")
public class Gender extends Ife {

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

}
