package com.example.Clothes_Shop_Online.controller;


import com.example.Clothes_Shop_Online.entity.Products;
import com.example.Clothes_Shop_Online.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductsService  productsService;
    @GetMapping("/home")
    public String getProducts(Model model){
        List<Products> productsList = new ArrayList<>();
        productsList = productsService.getAll();

        model.addAttribute("products",productsList);
        return "home";
    }


}
