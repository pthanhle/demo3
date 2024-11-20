package phuocthanh.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phuocthanh.Entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
