package com.example.Clothes_Shop_Online.repositories;

import com.example.Clothes_Shop_Online.entity.Categories;
import com.example.Clothes_Shop_Online.entity.ProductCategories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoriesRepository extends JpaRepository<ProductCategories, Integer> {
}
