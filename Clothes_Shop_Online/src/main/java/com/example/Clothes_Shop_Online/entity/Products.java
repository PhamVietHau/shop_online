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
@Table(name = "products")
public class Products {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String code;
  private String name;
  private double price;
  private String descriptions;
  private java.sql.Date create_date;
  private String img;
  private int sold;
@JsonIgnore
  @OneToMany(mappedBy = "products_ci")
  private List<CartItems> cartItems;
@JsonIgnore
  @OneToMany(mappedBy = "products_pc")
  private List<ProductCategories> categories;
@JsonIgnore
  @OneToMany(mappedBy = "products_op")
  private List<Options> options;
  @JsonIgnore
  @OneToMany(mappedBy = "products_detail")
  private List<OrderDetail> orderDetails;


}
