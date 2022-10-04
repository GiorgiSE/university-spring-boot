package com.projects.springbootuniversity.controllers;

import com.projects.springbootuniversity.entity.Bachelor;
import com.projects.springbootuniversity.service.BachelorService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bachelors")
public class BachelorsController {

    private final BachelorService service;

    public BachelorsController(final BachelorService bachelorService){
        this.service = bachelorService;
    }

    @GetMapping("")
    public List<? extends Bachelor> getAllBachelorsStudents(){
        return this.service.getAllBachelorFromUniversityDB();
    }

    @GetMapping("/{id}")
    public Bachelor getBachelorById(@PathVariable("id") Long id){
        return this.service.getBachelorById(id);
    }

    @PostMapping("")
    public Bachelor createBachelorStudent(@RequestBody Bachelor bachelor){
        return this.service.saveBachelorToUniversityDB(bachelor);
    }

    @PutMapping("/{id}")
    public Bachelor updateBachelorStudentById(@PathVariable("id") Long id , @RequestBody Bachelor bachelor){
        return this.service.updateBachelorStudentById(id , bachelor);
    }

    @DeleteMapping("/{id}")
    public String deleteBachelorStudentById(@PathVariable("id") Long id){
        this.service.deleteBachelorStudentById(id);
        return "Bachelor student deletes successfully";
    }

    @DeleteMapping("")
    public String deleteAllBachelorFromUniversityDB(){
        this.service.deleteAllBachelorFromUniversityDB();
        return "All bachelors from UniversityDb deleted successfully";
    }
}
