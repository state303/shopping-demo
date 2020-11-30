package io.dsub.shoppingdemo.product;

import io.dsub.shoppingdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
