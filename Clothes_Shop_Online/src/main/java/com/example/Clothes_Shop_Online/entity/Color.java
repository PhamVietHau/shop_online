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
@Table(name = "color")
public class Color {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String color;
  @JsonIgnore
  @OneToMany(mappedBy = "color_op")
  private List<Options> options;

}
