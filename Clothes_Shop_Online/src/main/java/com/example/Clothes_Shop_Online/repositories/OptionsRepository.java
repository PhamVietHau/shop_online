package com.example.Clothes_Shop_Online.repositories;

import com.example.Clothes_Shop_Online.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionsRepository extends JpaRepository<Customers, Integer> {
}
