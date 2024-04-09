package com.Products.test.test;

import com.Products.test.domain.Category;
import com.Products.test.domain.product.Product;
import com.Products.test.repositories.CategoryRepository;
import com.Products.test.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestInstantiate implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category c1 = new Category(null , "Ferramentas");
        Category c2 = new Category(null , "Utilidades");
        Category c3 = new Category(null , "AutoCuidado");
        Category c4 = new Category(null , "jardim");

        Product p1 = new Product(null,"porca 3/8",52.00 , 5 );
        Product p2 = new Product(null,"hidratante",90.00 ,  6);
        Product p3 = new Product(null,"fenda",20.50 , 2);
        Product p4 = new Product(null,"mangueira",150.00 , 3);
        Product p5 = new Product(null,"spray de contato",30.00 , 2);

        categoryRepository.saveAll(Arrays.asList(c1,c2,c3,c4));
        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

        p1.getCategories().add(c1); //aqui estou adionando na categoria objc1 o produto obj p1
        p2.getCategories().add(c3);
        p3.getCategories().add(c1);
        p4.getCategories().add(c4);
        p4.getCategories().add(c2);
        p5.getCategories().add(c1);

        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p4,p5));

    }
}
