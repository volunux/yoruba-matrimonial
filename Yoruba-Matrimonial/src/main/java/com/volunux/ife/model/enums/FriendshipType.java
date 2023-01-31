package com.volunux.ife.model.enums;

import com.volunux.ife.model.base.ConstParameter;
import lombok.Getter;

@Getter
public enum FriendshipType implements ConstParameter {

    SCHOOL("School"),
    COLLEGE("College"),
    ACQUITTANCE("Acquittance");

    private String value;

    FriendshipType(String value) {
        this.value = value;
    }
}
