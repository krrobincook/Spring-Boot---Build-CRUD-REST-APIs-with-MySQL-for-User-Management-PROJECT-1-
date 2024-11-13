package net.javaguides.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) // to specify that column in a database table cannot contain null value
    private String firstName;
    private String lastName;
    @Column(nullable = false,unique = true) // to make e-mail as a unique
    private String email;
}
