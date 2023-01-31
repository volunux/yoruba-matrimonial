package com.volunux.ife.model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Builder
@Getter
@Setter
@Entity
@Table(name = "chat_conversation")
public class ChatChannel extends Ife {

    @Column(name = "initiator")
    private Member initiator;

    @Column(name = "members")
    @ManyToMany
    @JoinTable(name = "group_user_x")
    private Set<Member> members;

    @Column(name = "description")
    private String description;

    @Column(name = "messages")
    private Set<ChatMessage> messages;
}
