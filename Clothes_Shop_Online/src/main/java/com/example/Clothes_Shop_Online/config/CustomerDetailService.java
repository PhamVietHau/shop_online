package com.example.Clothes_Shop_Online.config;


import com.example.Clothes_Shop_Online.entity.Customers;
import com.example.Clothes_Shop_Online.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CustomerDetailService implements UserDetailsService {
    @Autowired
    private CustomersRepository customersRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customers customers = customersRepository.findByEmail(username);
        if (customers == null){
            throw new UsernameNotFoundException("User not found");
        }
//        return new CustomerDetail(customers);
        return new User(
                customers.getEmail(),
                customers.getPassword(),
                customers.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getRoles().getRole()))
                        .collect(Collectors.toList())
        );





    }
}
