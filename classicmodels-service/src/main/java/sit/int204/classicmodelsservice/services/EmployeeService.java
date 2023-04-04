package sit.int204.classicmodelsservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import sit.int204.classicmodelsservice.entity.Employee;
import sit.int204.classicmodelsservice.entity.Office;
import sit.int204.classicmodelsservice.repositories.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private OfficeService service;

    public List<Employee> getAllEmployee(){
        return repository.findAll();
    }
    public Employee getEmployee(Integer id) {
        return repository.findById(id).orElseThrow(
                ()->new ResourceAccessException(id + " does not exist"));
    }
    public Employee createNewEmployee(String officeCode,Employee employee){
        Office office = service.getOffice(officeCode);
        employee.setOffice(office);
        return repository.saveAndFlush(employee);
    }
    public Employee updateEmployee(Integer id, Employee employee){
        Employee existingEmployee = repository.findById(id).orElseThrow(
                ()->new ResourceAccessException(id +" does not exist"));
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setExtension(employee.getExtension());
        existingEmployee.setId(employee.getId());
        existingEmployee.setEmployees(employee.getEmployees());
        existingEmployee.setJobTitle(employee.getJobTitle());
        return repository.saveAndFlush(existingEmployee);
    }

    public void removeEmployee(Integer id) {
        repository.delete(getEmployee(id));
    }

    public Employee save(Employee employee) {return repository.saveAndFlush(employee);}
}
