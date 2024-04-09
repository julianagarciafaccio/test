package com.Products.test.repositories;

import com.Products.test.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CategoryRepository extends JpaRepository<Category , Long> {
    Optional<Category> findByName(String name);
    Optional<Category> findById(Integer id);

}
