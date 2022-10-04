package com.projects.springbootuniversity.service;

import com.projects.springbootuniversity.entity.Bachelor;
import com.projects.springbootuniversity.entity.Student;
import com.projects.springbootuniversity.repository.BachelorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BachelorServiceImpl implements BachelorService{

    private final BachelorRepository repository;

    public BachelorServiceImpl(final BachelorRepository repository){
        this.repository = repository;
    }
    @Override
    public List<? extends Bachelor> getAllBachelorFromUniversityDB() {
        return this.repository.findAll();
    }

    @Override
    public Bachelor saveBachelorToUniversityDB(Bachelor bachelor){
        return this.repository.save(bachelor);
    }

    @Override
    public Bachelor updateBachelorStudentById(Long id, Bachelor bachelor) {
        if(!this.repository.existsById(id)){
            throw new RuntimeException("Bachelor student by given id doesn't exist!");
        }
        Bachelor b = this.repository.findById(id).get();
        b.setStudent(bachelor.getStudent());
        return this.repository.save(b);
    }

    @Override
    public void deleteBachelorStudentById(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Bachelor getBachelorById(Long id) {
        if(!this.repository.existsById(id)) throw new RuntimeException("Student doesn't exist by given Id!");
        return this.repository.findById(id).get();
    }

    @Override
    public void deleteAllBachelorFromUniversityDB() {
        this.repository.deleteAll();
    }
}
