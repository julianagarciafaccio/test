package com.Products.test.service;

import com.Products.test.domain.Category;
import com.Products.test.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements Serializable {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    public Category findByName(String name){
        Optional<Category> cat = categoryRepository.findByName(name);
        return cat.get();
    }

    public Category findById(Long id){
        Optional<Category> cat = categoryRepository.findById(id);
        return cat.get();
    }

}
