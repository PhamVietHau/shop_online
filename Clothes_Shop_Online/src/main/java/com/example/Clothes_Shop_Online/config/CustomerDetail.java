//package com.example.Clothes_Shop_Online.config;
//
//import com.example.Clothes_Shop_Online.entity.Customers;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.stream.Collectors;
//
//public class CustomerDetail implements UserDetails {
//    private final Customers user;
//
//    public CustomerDetail(Customers user) {
//        this.user = user;
//    }
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return user.getRoles().stream()
//                .map(useRole -> new SimpleGrantedAuthority(useRole.getRoles().getRole())).collect(Collectors.toList());
//    }
//
//    @Override
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getEmail();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true ;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true ;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true ;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//    public Customers getUser(){
//        return user;
//    }
//
//
//
//}
