package com.projects.springbootuniversity.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@NoArgsConstructor
@Getter
@Setter
public class Bachelor {
    @Id
    @SequenceGenerator(
            name = "bachelor_sequence",
            sequenceName = "bachelor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "bachelor_sequence")
    private Long id;
    @Embedded
    private Student student;

    public Bachelor(final Student student){
        this.student = Student.builder()
                .email(student.getEmail())
                .lastName(student.getLastName())
                .build();
    }
}
