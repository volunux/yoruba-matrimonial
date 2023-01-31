package com.volunux.ife.model.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Builder
@Getter
@Setter
@Entity
@Table(name = "chat_message")
public class ChatMessage extends Ife {

    @Column(name = "chat_channel_id")
    private ChatChannel chatChannel;

    @Column(name = "author_id")
    private Member author;

    @Column(columnDefinition = "TEXT", length = 8000)
    private String content;

    @Column(name = "message_type")
    private String messageType;

    @Column
    @OneToMany()
    private List<ChatReaction> reactions;

    private String slug;
}
