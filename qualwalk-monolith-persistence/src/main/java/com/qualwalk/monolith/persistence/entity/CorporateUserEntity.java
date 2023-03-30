package com.qualwalk.monolith.persistence.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "corporate_user")
public class CorporateUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "corporate_id")
    private CorporateEntity organization;

    private String username;

    private String email;

    @Column(name = "is_admin")
    private Boolean isAdmin;


}
