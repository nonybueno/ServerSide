package sit.int204.classicmodelservice2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.security.auth.Subject;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository repository;

    public List<Subject> getAllSubject() {
        return repository.findAll();
    }

    public Subject getSubject(String subjectCode){
        return repository.findById(subjectCode.orElseThrow(() -> new sit.int204.classicmodelservice.exceptions.ItemNotFoundException(
                "subject Code " + subjectCode + "Does Not Exist !!!")));
    }

    public Subject addSubject(Subject subject){
        return repository.saveAndFlush(subject);
    }

    public void deleteSubject(String subjectCode){
        repository.deleteById(subjectCode);
    }

}
