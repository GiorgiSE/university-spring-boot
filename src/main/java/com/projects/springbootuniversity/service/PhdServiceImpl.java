package com.projects.springbootuniversity.service;

import com.projects.springbootuniversity.entity.Phd;
import com.projects.springbootuniversity.repository.PhdRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PhdServiceImpl implements PhdService{

    private final PhdRepository repository;

    public PhdServiceImpl(final PhdRepository repository){
        this.repository = repository;
    }

    @Override
    public List<? extends Phd> getAllPhdStudentFromUniversityDB() {
        return this.repository.findAll();
    }

    @Override
    public Phd getPhdByIdFromUniversityDB(Long id) {
        if(!this.repository.existsById(id)) throw new NoSuchElementException("No Phd candidate with this id");
        return this.repository.findById(id).get();
    }

    @Override
    public Phd createPhdStudentInUniversityDB(Phd phd) {
        return this.repository.save(phd);
    }

    @Override
    public Phd updatePhdStudentUniversityDB(Long id, Phd phd) {
        if(!this.repository.existsById(id))throw new NoSuchElementException("No Phd candidate with this id");
        Phd phd1 = this.repository.findById(id).get();
        phd1.setStudent(phd.getStudent());
        return this.repository.save(phd1);
    }

    @Override
    public void deletePhdStudentByIdInUniversityDB(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public void deleteAllPhdStudentFromUniversityDB() {
        this.repository.deleteAll();
    }
}
