package com.example.Clothes_Shop_Online.service;

import com.example.Clothes_Shop_Online.entity.Customers;

import java.util.List;
import java.util.Optional;

public interface CustomersService {
    List<Customers> getAll();
    Optional<Customers> getByID(int id);
    Customers getByEmail(String Email);
}
