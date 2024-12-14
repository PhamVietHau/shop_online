package com.example.Clothes_Shop_Online.repositories;

import com.example.Clothes_Shop_Online.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
