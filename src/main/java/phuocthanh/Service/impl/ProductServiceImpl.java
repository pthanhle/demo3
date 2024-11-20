package phuocthanh.Service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phuocthanh.Entity.Product;
import phuocthanh.Repository.ProductRepository;
import phuocthanh.Service.ProductServices;


@Service
public class ProductServiceImpl implements ProductServices {

	 @Autowired
    private final ProductRepository repo;

   
    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Product> listAll() {
        return repo.findAll();
    }

    @Override
    public Product save(Product product) {
        return repo.save(product);
    }

    @Override
    public Product get(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

}
