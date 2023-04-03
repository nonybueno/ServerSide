package sit.int204.classicmodelservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleCustomerDto {
    private String customerName;
    private String phone;
    private String city;
    private String country;
    private String salesPerson;
}

//@Setter
//@Getter
//public class SimpleEmployeeDto{
//    private String lastName;
//    private String firstName;
//}

//@Setter
//@Getter
//public class SimpleEmployeeDto{
//    private String lastName;
//    private String firstName;
//    public String getName() {
//        return firstName+ " "+ lastName;
//    }
//}

//@Setter
//public class SimpleEmployeeDto{
//    private String lastName;
//    private String firstName;
//    public String getName() {
//        return firstName+ " "+ lastName;
//    }
//}

