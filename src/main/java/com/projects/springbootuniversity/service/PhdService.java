package com.projects.springbootuniversity.service;

import com.projects.springbootuniversity.entity.Phd;

import java.util.List;

public interface PhdService {
    List<? extends Phd> getAllPhdStudentFromUniversityDB();

    Phd getPhdByIdFromUniversityDB(Long id);

    Phd createPhdStudentInUniversityDB(Phd phd);

    Phd updatePhdStudentUniversityDB(Long id, Phd phd);

    void deletePhdStudentByIdInUniversityDB(Long id);

    void deleteAllPhdStudentFromUniversityDB();
}
