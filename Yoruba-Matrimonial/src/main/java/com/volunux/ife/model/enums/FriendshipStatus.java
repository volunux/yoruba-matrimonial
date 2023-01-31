package com.volunux.ife.model.enums;

import com.volunux.ife.model.base.ConstParameter;
import lombok.Getter;

@Getter
public enum FriendshipStatus implements ConstParameter {

    ACTIVE("Active"),
    PENDING("Pending"),
    REJECTED("Rejected");

    private String value;

    FriendshipStatus(String value) {
        this.value = value;
    }
}
