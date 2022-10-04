package com.projects.springbootuniversity.repository;

import com.projects.springbootuniversity.entity.Course;
import com.projects.springbootuniversity.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @Test
    void saveCourseMaterial(){
        CourseMaterial material = CourseMaterial.builder()
                .url("google.com")
                .course(Course.builder()
                        .title("CS")
                        .credit(5)
                        .build())
                .build();
        this.repository.save(material);
    }

}