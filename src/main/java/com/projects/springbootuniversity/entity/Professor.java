package com.projects.springbootuniversity.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Professor {

    @Id
    @SequenceGenerator(
            name = "professor_sequence",
            sequenceName = "professor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "professor_sequence")
    private Long id;
    private String firstName;
    private String lastName;
    @Column(name = "email")
    private String mail;

    public Professor(final String firstName,
                     final String lastName,
                     final String mail){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
    }
}
