package com.Products.test.service;

import com.Products.test.domain.Product;
import com.Products.test.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository prodRep;

    // a seguir metodo de consulta por nome
    public Product findByName(String name) throws Exception {
        return this.prodRep.findByName(name).orElseThrow(() -> new Exception("produto nao encontrado"));
    }

    public Product findById(Long id) throws Exception {
        return this.prodRep.findById(id).orElseThrow(() -> new Exception("id do produto nao encontrado"));
    }

    public Product findByPrice(Double price) throws Exception {
        return this.prodRep.findByPrice(price).orElseThrow(()-> new Exception("nao encontrado"));
    }

    public List<Product> findAll(){
        return this.prodRep.findAll();
    }

}
