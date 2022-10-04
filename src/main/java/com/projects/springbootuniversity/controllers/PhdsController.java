package com.projects.springbootuniversity.controllers;

import com.projects.springbootuniversity.entity.Phd;
import com.projects.springbootuniversity.service.PhdService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phds")
public class PhdsController {

    private final PhdService service;

    public PhdsController(final PhdService service){
        this.service = service;
    }

    @GetMapping("")
    public List<? extends Phd> getAllPhdStudentFromUniversityDB(){
        return this.service.getAllPhdStudentFromUniversityDB();
    }

    @GetMapping("/{id}")
    public Phd getPhdByIdFromUniversityDB(@PathVariable("id") Long id){
        return this.service.getPhdByIdFromUniversityDB(id);
    }

    @PostMapping("")
    public Phd createPhdStudentInUniversityDB(@RequestBody Phd phd){
        return this.service.createPhdStudentInUniversityDB(phd);
    }

    @PutMapping("/{id}")
    public Phd updatePhdStudentInUniversityDB(@PathVariable("id") Long id , @RequestBody Phd phd){
        return this.service.updatePhdStudentUniversityDB(id , phd);
    }

    @DeleteMapping("/{id}")
    public String deletePhdStudentByIdInUniversityDB(@PathVariable("id") Long id){
        this.service.deletePhdStudentByIdInUniversityDB(id);
        return "Phd student successfully deleted with ID -" + id;
    }

    @DeleteMapping("")
    public String deleteAllPhdStudentFromUniversityDB(){
        this.service.deleteAllPhdStudentFromUniversityDB();
        return "Every Phd student deleted successfully";
    }
}
