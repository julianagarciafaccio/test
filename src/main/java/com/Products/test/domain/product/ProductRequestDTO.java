package com.Products.test.domain.product;

import jakarta.persistence.Column;

public record ProductRequestDTO(
        @Column(nullable = false)
        String name ,
        @Column(nullable = false)
        Double price
) {

}
