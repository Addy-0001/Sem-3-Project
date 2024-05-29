package com.example.gymfitbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "auth_users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "email_address")
    private String email_address; // Save the username as is
    @Column(name = "password")
    private String password; // Hash the password and save it (sha256 hash and salt it before storing).
    @Column(name = "is_admin_user")
    private boolean is_admin; // only allow if the user is admin
    @Column(name = "is_active_user")
    private boolean is_active; // only allow if the user is active
    @Column(name = "payment_due")
    private boolean payment_due; // tick if the payment is due
    @Column(name = "client_type")
    private String client_type;
}
