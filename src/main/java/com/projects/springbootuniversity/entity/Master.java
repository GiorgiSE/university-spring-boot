package com.projects.springbootuniversity.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Master {
    @Id
    @SequenceGenerator(
            name = "master_sequence",
            sequenceName = "master_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "master_sequence")
    private Long id;
    @Embedded
    private Student student;

    public Master(final Student student){
        this.student = Student.builder()
                .email(student.getEmail())
                .lastName(student.getLastName())
                .build();
    }
}
