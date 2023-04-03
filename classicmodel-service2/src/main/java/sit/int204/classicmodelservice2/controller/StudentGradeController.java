package sit.int204.classicmodelservice2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sit.int204.classicmodelservice2.dtos.StudentGradeDTO;

import javax.security.auth.Subject;

@RestController
@RequestMapping("/64130500101/api/grade")
public class StudentGradeController {
    @Autowired
    protected StudentGradeService studentGradeService;

    public class StudentGradeService{
        @GetMapping("/{studentId}")
        public StudentGrade getAllGradeById(@PathVariable Integer studentId){
            return modelMapper.map(studentGradeService.getGradeById,StudentGradeDTO.class);
        }

        @GetMapping("/{studentId}/{subjectCode}")
        public StudentGrade getGradeAndSubjectCode(@PathVariable Integer studentId,@PathVariable String subjectCode){
            return  studentGradeService.getStudentGradeByIdAndSubjectCode(studentId,subjectCode);
        }

        @PostMapping("/{studentId}")
        public StudentGrade addNewGrade(@PathVariable studentId, @RequestBody Subject subject){
            studentGradeService.addGrade(studentId,subject);
            return StudentGrade;
        }

}
