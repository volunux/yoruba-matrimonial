package com.volunux.ife.model.domain;

import com.volunux.ife.model.enums.FriendshipStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "member_friendship",
        indexes = {
            @Index(
                    name = "friend_1_idx",
                    columnList = "friend_1_id"
            ),
            @Index(
                    name = "friend_2_idx",
                    columnList = "friend_2_id"
            )
        },
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = { "friend_1_id" , "friend_2_id"},
                        name = "member_friends_idx"
                )
        }
)
public class Friendship extends Ife {

    @Column(name = "friend_1_id")
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Member friend1;

    @Column(name = "friend_2_id")
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private Member friend2;

    @Column(name = "status")
    private FriendshipStatus status;

}
