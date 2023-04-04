package sit.int204.classicmodelsservice.services;

import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import sit.int204.classicmodelsservice.entity.Employee;
import sit.int204.classicmodelsservice.entity.Product;
import sit.int204.classicmodelsservice.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public Page<Product> getAllProductWithPaging(int page, int size, String sortBy){
        Sort sort = Sort.by(sortBy);
        Pageable pageable = PageRequest.of(page,size);
        return repository.findAll(pageable);
    }
    public List<Product> getProductBuyPriceBetween(Double low,Double high){
        if(low>high){
            return repository.findProductByPriceBetweenOrderByPriceDesc(high,low);
        }else{
            return repository.findProductByPriceBetweenOrderByPriceDesc(low,high);
        }
    }
    public List<Product> getProductByProductLine(String productLine,String sortBy){
        Sort sort = Sort.by(sortBy);
        return repository.findProductByProductLine(productLine,sort);
    }

    public Product updateProduct(String id, Product product){
        Product existingProduct = repository.findById(id).orElseThrow(
                ()->new ResourceAccessException(id +" does not exist"));
        existingProduct.setId(product.getId());
        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductLine(product.getProductLine());
        existingProduct.setProductScale(product.getProductScale());
        existingProduct.setProductVendor(product.getProductVendor());
        existingProduct.setProductDescription(product.getProductDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setBuyPrice(product.getBuyPrice());
        existingProduct.setQuantityInStock(product.getQuantityInStock());
        return repository.saveAndFlush(existingProduct);
    }
    public Product createNewProduct(Product product){
        return repository.saveAndFlush(product);
    }
}
