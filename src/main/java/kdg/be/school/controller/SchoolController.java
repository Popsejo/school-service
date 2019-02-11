package kdg.be.school.controller;

import kdg.be.school.model.School;
import kdg.be.school.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {
    @Autowired
    private SchoolService service;

    @GetMapping("/getSchool/{id}")
    public School getSchool(int id){
        return this.service.getSchool(id);
    }


    @GetMapping("/getAllSchools")
    public List<School> getSchools(){
        return this.service.getAllSchools();
    }


    @GetMapping("/init")
    public List<School> initSchools(){
        this.service.fillDatabase();
        return this.service.getAllSchools();
    }




}
