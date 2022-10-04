package com.projects.springbootuniversity.controllers;

import com.projects.springbootuniversity.entity.Master;
import com.projects.springbootuniversity.service.MasterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/masters")
public class MastersController {

    private final MasterService service;

    public MastersController(final MasterService service){
        this.service = service;
    }

    @GetMapping("")
    public List<? extends Master> getAllMasterFromUniversityDB(){
        return this.service.getAllMasterFromUniversityDB();
    }

    @GetMapping("/{id}")
    public Master getMasterByIdFromUniversityDB(@PathVariable("id") Long id){
        return this.service.getStudentByIdFromUniversityDB(id);
    }

    @PostMapping("")
    public Master createMasterStudentInUniversityDB(@RequestBody Master master){
        return this.service.createMasterStudentInUniversityDB(master);
    }

    @PutMapping("/{id}")
    public Master updateMasterStudentByIdInUniversityDB(@PathVariable("id") Long id , @RequestBody Master master){
        return this.service.updateMasterStudentByIdInUniversityDB(id , master);
    }

    @DeleteMapping("/{id}")
    public String deleteMasterStudentByIdInUniversityDB(@PathVariable("id") Long id){
        this.service.deleteMasterStudentByIdInUniversityDB(id);
        return "Student deleted successfully with ID - " + id;
    }

    @DeleteMapping("")
    public String deleteAllMasterStudentInUniversityDB(){
        this.service.deleteAllMasterStudentInUniversityDB();
        return "Every master student deleted successfully";
    }

}
