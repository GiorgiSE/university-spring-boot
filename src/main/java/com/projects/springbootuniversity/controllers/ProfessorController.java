package com.projects.springbootuniversity.controllers;

import com.projects.springbootuniversity.entity.Professor;
import com.projects.springbootuniversity.service.ProfessorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {

    private final ProfessorService service;

    public ProfessorController(final ProfessorService service){
        this.service = service;
    }

    @GetMapping("")
    public List<Professor> getAllProfessorFromUniversityDB(){
        return this.service.getAllProfessorFromUniversityDB();
    }
}
