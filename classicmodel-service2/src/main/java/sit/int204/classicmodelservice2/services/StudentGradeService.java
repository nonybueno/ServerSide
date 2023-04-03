package sit.int204.classicmodelservice2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;

@Service
public class StudentGradeService {
    @Autowired
    private StudeGradeRepository studeGradeRepository;

    public StudentGrade getGradeById(Integer studentId){
        return studeGradeRepository.findById(studentId.orElseThrow(() -> new sit.int204.classicmodelservice.exceptions.ItemNotFoundException(
                "Student id " + studentId + "Does Not Exist !!!")));
    }

    public StudentGrade getStudentGradeByIdAndSubjectCode(Integer studentId, String subjectCode){
        return studeGradeRepository.findByIdAndSubjectCode(studentId,subjectCode);
    }

    public StudentGrade addGrade(Integer studentId, Subject subject){
        subject.setStudentId(studeGradeRepository.findById(studentId.orElseThrow(() -> new sit.int204.classicmodelservice.exceptions.ItemNotFoundException(
                "Student id " + studentId + "Does Not Exist !!!"))));
        return studeGradeRepository.saveAndFlush(subject);
    }
}
