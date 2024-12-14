package com.example.Clothes_Shop_Online.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "cart")
public class Cart {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  private Customers customers;
  private java.sql.Date created_date;
  private java.sql.Date update_date;
  @JsonIgnore
  @OneToMany(mappedBy = "cart_ci")
  private List<CartItems> cartItems;


}
