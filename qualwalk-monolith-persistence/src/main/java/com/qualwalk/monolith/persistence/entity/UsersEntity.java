package com.qualwalk.monolith.persistence.entity;


import com.qualwalk.monolith.domain.enums.UserType;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private UserType type;

    @Column(name = "is_verified")
    private Boolean isVerified;
}
