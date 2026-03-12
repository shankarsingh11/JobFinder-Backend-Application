package com.jobportal.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "user")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "useId")
    private Long userId;
    @Column(name = "name")
    private String name;
    @Column(name = "username")
    private String  username;
    @Column(name="password")
    private String  password;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(name = "email")
    private String email;
    @Column(name = "created_date_time")
    private LocalDateTime createdAt;



}
