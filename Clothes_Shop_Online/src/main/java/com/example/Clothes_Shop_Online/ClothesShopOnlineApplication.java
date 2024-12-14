package com.example.Clothes_Shop_Online;

import com.example.Clothes_Shop_Online.entity.Customers;
import com.example.Clothes_Shop_Online.entity.Products;
import com.example.Clothes_Shop_Online.repositories.CustomersRepository;
import com.example.Clothes_Shop_Online.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ClothesShopOnlineApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClothesShopOnlineApplication.class, args);
	}

}
