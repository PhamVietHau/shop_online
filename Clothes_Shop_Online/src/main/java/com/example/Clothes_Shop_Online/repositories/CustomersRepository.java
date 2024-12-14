package com.example.Clothes_Shop_Online.repositories;

import com.example.Clothes_Shop_Online.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {
    Customers findByEmail(String email);
}
