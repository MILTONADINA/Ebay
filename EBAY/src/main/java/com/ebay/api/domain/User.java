package com.ebay.api.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users") // avoid reserved word 'user' in Postgres
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String address;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole userRole;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<PaymentMethod> paymentMethods;

    @OneToMany(mappedBy = "ratedUser", cascade = CascadeType.ALL)
    private List<Rating> receivedRatings;

    @OneToMany(mappedBy = "ratedBy", cascade = CascadeType.ALL)
    private List<Rating> givenRatings;
}
