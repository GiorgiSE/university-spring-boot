package com.projects.springbootuniversity.service;

import com.projects.springbootuniversity.entity.Bachelor;

import java.util.List;

public interface BachelorService {
    List<? extends Bachelor> getAllBachelorFromUniversityDB();

    Bachelor saveBachelorToUniversityDB(Bachelor bachelor);

    Bachelor updateBachelorStudentById(Long id, Bachelor bachelor);

    void deleteBachelorStudentById(Long id);

    Bachelor getBachelorById(Long id);

    void deleteAllBachelorFromUniversityDB();
}
