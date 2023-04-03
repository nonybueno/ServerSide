package sit.int204.classicmodelservice2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentGradeRepository extends JpaRepository<StudentGrade , Integer> {
    List<StudentGrade> findStudentGradeByIdAndSubjectCode(Integer studentId, String subjectCode);
}
