package sit.int204.classicmodelservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import sit.int204.classicmodelservice.entity.Employee;
import sit.int204.classicmodelservice.entity.Office;
import sit.int204.classicmodelservice.repositories.OfficeRepository;

import java.util.List;
import java.util.Set;

@Service
public class OfficeService {
    @Autowired
    private OfficeRepository repository;

    public List<Office> getAllOffice() {
        return repository.findAll();
    }

    public Office getOffice(String officeCode) {
        return repository.findById(officeCode).orElseThrow(
                () -> new ResourceAccessException(officeCode + " does not exist"));
    }

    public Office createNewOffice(Office office) {
        return repository.saveAndFlush(office);
    }

    public Office updateOffice(String officeCode, Office office) {
        Office existingOffice = repository.findById(officeCode).orElseThrow(
                () -> new ResourceAccessException(officeCode + " does not exist"));
        existingOffice.setCity(office.getCity());
        existingOffice.setCountry(office.getCountry());
        existingOffice.setAddressLine1(office.getAddressLine1());
        existingOffice.setAddressLine2(office.getAddressLine2());
        existingOffice.setPhone(office.getPhone());
        return repository.saveAndFlush(existingOffice);
    }

    public Set<Employee> getOfficeEmployees(String officeCode) {
        Office office = getOffice(officeCode);
        return office.getEmployees();
    }
}
