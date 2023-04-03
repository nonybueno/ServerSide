package sit.int204.classicmodelservice.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sit.int204.classicmodelservice.dtos.SimpleEmployeeDto;
import sit.int204.classicmodelservice.entity.Employee;
import sit.int204.classicmodelservice.services.EmployeeService;
import sit.int204.classicmodelservice.utils.ListMapper;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ListMapper listMapper;

    @GetMapping("")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployee();
    }

    @PutMapping("/{id}")
    public Employee createEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        return service.updateEmployee(id, employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return service.getEmployee(id);
    }

    @DeleteMapping({"/{id}"})
    public void deleteEmployee(@PathVariable Integer id) {
        service.removeEmployee(id);
    }

    @PostMapping("")
    public Employee create(@RequestBody SimpleEmployeeDto newEmployee) {
        Employee e = modelMapper.map(newEmployee, Employee.class);
        return service.save(e);
    }
//    @GetMapping("")
//    public List<SimpleEmployeeDto> getEmployees() {
//        List<Employee> employeeList = service.findAll();
//        return mapList(employeeList, EmployeeOfficeDTO.class, modelMapper);
//    }
}
