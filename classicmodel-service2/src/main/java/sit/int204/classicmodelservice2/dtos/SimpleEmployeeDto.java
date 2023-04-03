package sit.int204.classicmodelservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimpleEmployeeDto {
    private Integer id;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private String jobTitle;
    private String officeId;
}
