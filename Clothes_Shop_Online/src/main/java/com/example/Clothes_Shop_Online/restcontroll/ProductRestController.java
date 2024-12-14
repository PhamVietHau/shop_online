package com.example.Clothes_Shop_Online.restcontroll;

import com.example.Clothes_Shop_Online.entity.Products;
import com.example.Clothes_Shop_Online.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/api/products")
public class ProductRestController {
    @Autowired
    private ProductsService productsService;

    @GetMapping("")
    public Object all(){
        return productsService.getAll();
    }
    @GetMapping("/id")
    public Object getByID(@RequestParam int id){
        return productsService.getById(id);
    }
    @PostMapping("")
    public Object save(@RequestBody Products products){
        return productsService.getAll();
    }
    @DeleteMapping("")
    public Object delete(){
        return productsService.getAll();
    }

}
