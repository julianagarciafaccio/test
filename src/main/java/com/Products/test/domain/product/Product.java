package com.Products.test.domain.product;

import com.Products.test.domain.Category;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@EqualsAndHashCode
@Entity
@Table(name = "products")
public class Product implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    @ManyToMany
    @JoinTable(name="tb_product_category", joinColumns = @JoinColumn(name ="product_name" , referencedColumnName = "name") , inverseJoinColumns = @JoinColumn(name ="category_name" , referencedColumnName = "name"))
    private Set<Category> categories = new HashSet<>();
    public Product(){}
    public Product(ProductRequestDTO prodto){

    }

    public Product(Long id, String name, Double price, Integer quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Set<Category> getCategories() {
        return categories;
    }

}
