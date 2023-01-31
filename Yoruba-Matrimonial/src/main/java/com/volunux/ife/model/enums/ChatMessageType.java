package com.volunux.ife.model.enums;

import com.volunux.ife.model.base.ConstParameter;
import lombok.Getter;

@Getter
public enum ChatMessageType implements ConstParameter {

    IMAGE("Image"),
    VOICE("Voice"),
    VIDEO("Video"),
    LINK("Link"),
    TEXT("Text");

    private String value;

    ChatMessageType(String value) {
        this.value = value;
    }
}
