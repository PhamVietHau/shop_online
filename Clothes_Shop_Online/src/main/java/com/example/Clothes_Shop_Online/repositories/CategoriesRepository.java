package com.example.Clothes_Shop_Online.repositories;

import com.example.Clothes_Shop_Online.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
}
