package com.example.Clothes_Shop_Online.repositories;

import com.example.Clothes_Shop_Online.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
