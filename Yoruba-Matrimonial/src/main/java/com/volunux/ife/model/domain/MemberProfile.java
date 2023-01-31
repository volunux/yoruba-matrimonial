package com.volunux.ife.model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@Getter
@Setter
@Entity
@Table(name = "member_profile")
public class MemberProfile {

}
