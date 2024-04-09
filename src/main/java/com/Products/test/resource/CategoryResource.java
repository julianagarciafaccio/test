package com.Products.test.resource;

import com.Products.test.domain.Category;
import com.Products.test.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> cat = categoryService.findAll();
        return ResponseEntity.ok().body(cat);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category cat = categoryService.findById(id);
        return ResponseEntity.ok().body(cat);
    }
    @GetMapping(value = "/categories/name")
    public ResponseEntity<Category> findByName(@PathVariable String name){
        Category cat = categoryService.findByName(name);
        return ResponseEntity.ok().body(cat);
    }

}
