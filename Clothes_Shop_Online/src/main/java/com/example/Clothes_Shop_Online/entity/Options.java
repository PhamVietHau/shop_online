package com.example.Clothes_Shop_Online.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "options")
public class Options {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
@JsonIgnore
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name ="color_id" )
  private Color color_op;
@JsonIgnore
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "size_id")
  private Size size_op;
@JsonIgnore
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "product_id")
  private Products products_op;
  private int amount;


}
