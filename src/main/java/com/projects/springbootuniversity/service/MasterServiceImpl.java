package com.projects.springbootuniversity.service;

import com.projects.springbootuniversity.entity.Master;
import com.projects.springbootuniversity.repository.MasterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MasterServiceImpl implements MasterService{

    private final MasterRepository repository;

    public MasterServiceImpl(final MasterRepository repository){
        this.repository = repository;
    }

    @Override
    public List<? extends Master> getAllMasterFromUniversityDB() {
        return this.repository.findAll();
    }

    @Override
    public Master getStudentByIdFromUniversityDB(Long id) {
        if(!this.repository.existsById(id)){
            throw new NoSuchElementException("No master student found by this Id!");
        }
        return this.repository.findById(id).get();
    }

    @Override
    public Master createMasterStudentInUniversityDB(Master master) {
        return this.repository.save(master);
    }

    @Override
    public Master updateMasterStudentByIdInUniversityDB(Long id, Master master) {
        if(!this.repository.existsById(id))throw new NoSuchElementException("No master student found by this name!");

        Master master1 = this.repository.findById(id).get();
        master1.setStudent(master.getStudent());

        return this.repository.save(master1);
    }

    @Override
    public void deleteMasterStudentByIdInUniversityDB(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public void deleteAllMasterStudentInUniversityDB() {
        this.repository.deleteAll();
    }
}
