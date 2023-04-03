package sit.int204.classicmodelservice2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sit.int204.classicmodelservice2.services.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/64130500101/api/grade")
public class SubjectController {
    @Autowired
    private SubjectService service;

    @GetMapping("")
    public List<Subject> getAllSubject(){
        return service.getAllSubjects();
    }
     @GetMapping("/{subjectCode}")
    public Subject getSubject(@PathVariable String subjectCode){
        return service.getSubject(subjectCode);
     }

     @PostMapping("")
    public Subject addNewSubject(@RequestBody String subjectCode){
        return service.addSubject(subjectCode);
     }

     @DeleteMapping("/{subjectCode}"){
        public service.deleteSubject(subjectCode);
     }
}
