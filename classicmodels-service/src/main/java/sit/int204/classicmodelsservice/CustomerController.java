package sit.int204.classicmodelsservice;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import sit.int204.classicmodelsservice.dtos.SimpleCustomerDto;
import sit.int204.classicmodelsservice.entity.Customer;
import sit.int204.classicmodelsservice.services.CustomerService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController{
    @Autowired
    private CustomerService service;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ListMapper listMapper;
    @GetMapping("/pages")
    public PageDto<SimpleCustomerDto> getCustomersPage(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size){
        Page<Customer> customerPage = service.getCustomersPage(page, size);
        return listMapper.toPageDTO(customerPage,SimpleCustomerDto.class,modelMapper);
    }
    @GetMapping("/{customerId}")
    public SimpleCustomerDto getSimpleCustomerById(@PathVariable Integer customerId) {
        return modelMapper.map(service.getCustomerById(customerId), SimpleCustomerDto.class);
    }
    @GetMapping
    public List<SimpleCustomerDto> getSimpleCustomers(){
        List<Customer> customerList = service.getCustomers();
//        List<SimpleCustomerDto> simpleCustomerDtoList = new ArrayList<>(customerList.size());
//        for (Customer c : customerList){
//            simpleCustomerDtoList.add(modelMapper.map(c,SimpleCustomerDto.class));
//        }
//        return simpleCustomerDtoList;
        return listMapper.mapList(customerList, SimpleCustomerDto.class, modelMapper);
    }
}

