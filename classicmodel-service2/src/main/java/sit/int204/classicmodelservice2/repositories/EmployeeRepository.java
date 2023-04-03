package sit.int204.classicmodelservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.classicmodelservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
