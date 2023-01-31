package com.volunux.ife.model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "member" ,
        indexes = {
            @Index(
                    columnList = "email_address",
                    name = "member_email_address_idx",
                    unique = true
            )
        },
        uniqueConstraints = {
            @UniqueConstraint(
                    columnNames = { "email_address" },
                    name = "member_email_address_idx"
            ),
            @UniqueConstraint(
                    columnNames = { "mobile_phone" },
                    name = "member_mobile_phone_idx"
            ),
        }
)
public class Member extends Ife {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "mobile_phone", nullable = false)
    private String mobilePhone;

    @Column(name = "email_address", nullable = false)
    private String email_address;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "introduction")
    private String intro;

    @Column(name = "picture")
    private String picture;

    @Column(name = "active")
    private String active;

    @Column(name = "last_login")
    private String lastLogin;

    @Column(name = "slug")
    private String slug;
}
