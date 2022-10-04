package com.projects.springbootuniversity.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class Phd {
    @Id
    @SequenceGenerator(
            name = "phd_sequence",
            sequenceName = "phd_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "phd_sequence")
    private Long id;
    @Embedded
    private Student student;

    public Phd(final Student student){
        this.student = Student.builder()
                .email(student.getEmail())
                .lastName(student.getLastName())
                .build();
    }
}
