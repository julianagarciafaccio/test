package com.Products.test.repositories;

import com.Products.test.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long> {
    //busca por nome do produto
    Optional<Product> findByName(String name);
    Optional<Product> findById(Long id);
    Optional<Product> findByPrice(Double price);

}
