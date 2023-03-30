package com.qualwalk.monolith.persistence.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity@Data
@NoArgsConstructor
@Table(name = "corporate")
public class CorporateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UsersEntity user;

    @Column(name = "name")
    private String orgName;

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private Set<CorporateUserEntity> users;
}
