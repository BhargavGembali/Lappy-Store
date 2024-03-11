package com.bhargav.LappyStore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhargav.LappyStore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{
    
}
