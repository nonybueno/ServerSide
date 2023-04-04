package sit.int204.classicmodelsservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.classicmodelsservice.entity.Orderdetail;

public interface OrderdetailRepository extends JpaRepository<Orderdetail, String> {
}
