package com.Products.test.test;

import com.Products.test.domain.Product;
import com.Products.test.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestInstantiate implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {
        Product p1 = new Product(null,"porca 3/8",52.00 , 5);
        Product p2 = new Product(null,"parafuso",90.00 ,  6);
        Product p3 = new Product(null,"porca 2/3",20.50 , 2);
        Product p4 = new Product(null,"graxa de embregem",150.00 , 3);
        Product p5 = new Product(null,"spray de contato",30.00 , 2);

        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

    }
}
