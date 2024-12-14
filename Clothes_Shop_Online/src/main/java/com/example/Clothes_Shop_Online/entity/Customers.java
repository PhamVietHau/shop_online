package com.example.Clothes_Shop_Online.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "customers")
public class Customers {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String email;
  private String password;
  private String name;
  private String shipping_address;
  private String country;
  private String phone;
  @JsonIgnore
  @OneToMany(mappedBy = "customers_order")
  private List<Orders> orders;
  @OneToOne(mappedBy = "customers")
  private Cart cart;
  @JsonIgnore
  @OneToMany(mappedBy = "customers_roles",fetch = FetchType.EAGER)
  private List<UseRole> roles;

  public List<String> getRoleNames(){
    return roles.stream()
            .map(useRole ->  useRole.getRoles().getRole()).collect(Collectors.toList());
  }





}
