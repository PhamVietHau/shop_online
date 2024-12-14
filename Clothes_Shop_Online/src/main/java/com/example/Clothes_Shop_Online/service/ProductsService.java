package com.example.Clothes_Shop_Online.service;

import com.example.Clothes_Shop_Online.entity.Products;

import java.util.List;
import java.util.Optional;

public interface ProductsService {
    public int delete(int id);
    public int save(Products products);
    public List<Products> getAll();
    public Optional<Products> getById(int id);

}
