package com.example.Clothes_Shop_Online.service.implement;

import com.example.Clothes_Shop_Online.entity.Products;
import com.example.Clothes_Shop_Online.repositories.ProductRepository;
import com.example.Clothes_Shop_Online.service.ProductsService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsServiceImp implements ProductsService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public int delete(int id) {
        if(productRepository.existsById(id)){
            productRepository.deleteById(id);
            return 1;
        }
        else
            return 0;

    }

    @Override
    @Transactional
    public int save(Products products) {
        try {
            productRepository.save(products);
            return 1;
        }catch (Exception e){
            System.out.println("Error: "+e);
            return 0;
        }
    }

    @Override
    public List<Products> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Products> getById(int id) {
        return productRepository.findById(id);
    }



}
