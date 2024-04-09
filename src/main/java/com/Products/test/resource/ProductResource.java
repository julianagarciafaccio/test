package com.Products.test.resource;

import com.Products.test.domain.product.Product;
import com.Products.test.domain.product.ProductRequestDTO;
import com.Products.test.domain.product.ProductResponseDTO;
import com.Products.test.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "product")
public class ProductResource {
    @Autowired
    private ProductRepository repository;

    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Valid ProductRequestDTO body){
        Product prod = new Product(body);
        this.repository.save(prod);
        return ResponseEntity.ok().build();

    }
    @GetMapping
    public ResponseEntity getAllProducts(){
        List<ProductResponseDTO> productList = this.repository.findAll().stream().map(ProductResponseDTO::new).toList();

        return ResponseEntity.ok(productList);
    }


}
