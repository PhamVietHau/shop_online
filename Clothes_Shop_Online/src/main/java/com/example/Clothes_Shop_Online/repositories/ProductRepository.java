package com.example.Clothes_Shop_Online.repositories;

import com.example.Clothes_Shop_Online.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products ,Integer> {
}
