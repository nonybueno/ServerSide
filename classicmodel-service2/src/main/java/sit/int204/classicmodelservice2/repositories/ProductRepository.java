package sit.int204.classicmodelservice.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.classicmodelservice.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findProductByPriceBetweenOrderByPriceDesc(Double low, Double high);

    List<Product> findProductByProductLine(String productLine, Sort sortBy);
}
