package com.qualwalk.monolith.persistence.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Table(name = "individual_details")
@Entity
public class IndividualDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UsersEntity user;

    private String username;

    private String firstname;

    private String lastname;

    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String organization;

    private Integer experience;
}
