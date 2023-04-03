package sit.int204.classicmodelservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import sit.int204.classicmodelservice.entity.Product;
import sit.int204.classicmodelservice.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    protected ProductService service;

    @GetMapping("/pages")
    public Page<Product> getAllProduct(
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "15") Integer size,
            @RequestParam(defaultValue = "productCode") String sortBy) {
        return service.getAllProductWithPaging(page, size, sortBy);
    }

    @GetMapping("/{min}/{max}")
    public List<Product> getProductFilter(@PathVariable Double min, @PathVariable Double max) {
        return service.getProductBuyPriceBetween(min, max);
    }

    @GetMapping("/{productLine}")
    public List<Product> getProductByProductLineSorting(@PathVariable String productLine, @RequestParam String sortBy) {
        return service.getProductByProductLine(productLine, sortBy);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product product) {
        return service.updateProduct(id, product);
    }

    @PostMapping("")
    public Product createProduct(@RequestBody Product product) {
        return service.createNewProduct(product);
    }
}
