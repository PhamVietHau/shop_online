package com.example.Clothes_Shop_Online.restcontroll;


import com.example.Clothes_Shop_Online.entity.Customers;
import com.example.Clothes_Shop_Online.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/api/customer")
public class CustomerRestController {
    @Autowired
    CustomersService customersService;
    @GetMapping("")
    public Object all(){
        return customersService.getAll();
    }
    @GetMapping("/id")
    public Object getByID(@RequestParam int id){
        return customersService.getByID(id);
    }
    @GetMapping("/email")
    public Object getByEmail(@RequestParam String email){
        Customers customers = customersService.getByEmail(email);
       return customers.getRoleNames();
    }


}
