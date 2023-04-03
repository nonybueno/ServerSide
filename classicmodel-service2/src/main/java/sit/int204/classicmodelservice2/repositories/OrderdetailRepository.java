package sit.int204.classicmodelservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.classicmodelservice.entity.Orderdetail;

public interface OrderdetailRepository extends JpaRepository<Orderdetail, String> {
}
