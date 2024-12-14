package com.example.Clothes_Shop_Online.repositories;

import com.example.Clothes_Shop_Online.entity.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemsRepository extends JpaRepository<CartItems, Integer> {
}
