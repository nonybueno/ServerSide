package sit.int204.classicmodelsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sit.int204.classicmodelsservice.entity.Employee;
import sit.int204.classicmodelsservice.entity.Office;
import sit.int204.classicmodelsservice.services.EmployeeService;
import sit.int204.classicmodelsservice.services.OfficeService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/offices")
public class OfficeController {
    @Autowired
    protected OfficeService service;
    @Autowired
    protected EmployeeService services;

    @GetMapping("")
    public List<Office> getAllOffice(){
        return service.getAllOffice();
    }

    @GetMapping("/{officeCode}")
    public Office getOffice(@PathVariable String officeCode){
        return service.getOffice(officeCode);
    }
    @PostMapping("")
    public Office createOffice(@RequestBody Office office){
        return service.createNewOffice(office);
    }
    @PutMapping("/{officeCode}")
    public Office createOffice(@PathVariable String officeCode, @RequestBody Office office){
        return service.updateOffice(officeCode, office);
    }
    @GetMapping("/{officeCode}/employees")
    public Set<Employee> getOfficeEmployees(@PathVariable String officeCode){
        return service.getOfficeEmployees(officeCode);
    }
    @PostMapping("/{officeCode}/employees")
    public Employee createEmployee(@PathVariable String officeCode , @RequestBody Employee employee){
        return  services.createNewEmployee(officeCode,employee);
    }
}
