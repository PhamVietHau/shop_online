package com.example.Clothes_Shop_Online.service.implement;

import com.example.Clothes_Shop_Online.entity.Customers;
import com.example.Clothes_Shop_Online.repositories.CustomersRepository;
import com.example.Clothes_Shop_Online.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomersServiceImp implements CustomersService {
    @Autowired
    private CustomersRepository customersRepository;
    @Override
    public List<Customers> getAll() {
        return customersRepository.findAll();
    }

    @Override
    public Optional<Customers> getByID(int id) {
        return customersRepository.findById(id);
    }

    @Override
    public Customers getByEmail(String email) {
        return customersRepository.findByEmail(email);
    }
}
