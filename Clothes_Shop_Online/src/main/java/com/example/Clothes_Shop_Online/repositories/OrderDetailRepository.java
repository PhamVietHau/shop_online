package com.example.Clothes_Shop_Online.repositories;

import com.example.Clothes_Shop_Online.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
}
