package com.projects.springbootuniversity.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Embeddable
@Builder
public class Student {

    @Column(name = "student_Name")
    private String firstName;
    @Column(name = "student_LastName")
    private String lastName;
    @Column(name = "student_age")
    private String email;

    public Student(final String firstName,
                   final String lastName,
                   final String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


}
