package com.projects.springbootuniversity.service;

import com.projects.springbootuniversity.entity.Professor;

import java.util.List;

public interface ProfessorService {

    Professor saveProfessorToUniversityDB(Professor professor);
    List<Professor> getAllProfessorFromUniversityDB();
}
