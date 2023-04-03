package sit.int204.classicmodelservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.classicmodelservice.entity.Office;

public interface OfficeRepository extends JpaRepository<Office, String> {

}
