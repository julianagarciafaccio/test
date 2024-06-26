package com.Products.test.domain.product;

public record ProductResponseDTO(Long id , String name , Double price) {
    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName(), product.getPrice());
    }
}
