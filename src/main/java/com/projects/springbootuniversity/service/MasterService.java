package com.projects.springbootuniversity.service;

import com.projects.springbootuniversity.entity.Master;

import java.util.List;

public interface MasterService {
    List<? extends Master> getAllMasterFromUniversityDB();

    Master getStudentByIdFromUniversityDB(Long id);

    Master createMasterStudentInUniversityDB(Master master);

    Master updateMasterStudentByIdInUniversityDB(Long id, Master master);

    void deleteMasterStudentByIdInUniversityDB(Long id);

    void deleteAllMasterStudentInUniversityDB();
}
