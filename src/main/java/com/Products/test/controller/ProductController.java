package com.Products.test.controller;

import com.Products.test.domain.Product;
import com.Products.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService prodServ;

    @GetMapping("products/names")
    public ResponseEntity<Product> findByName(@PathVariable String name) throws Exception {
        Product prod = prodServ.findByName(name);
        return ResponseEntity.ok().body(prod);
    }

}
