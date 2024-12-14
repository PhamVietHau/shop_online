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
@Table(name = "size")
public class Size {
  @Id
  private int id;
  private String size;
  @JsonIgnore
  @OneToMany(mappedBy = "size_op")
  private List<Options> options;

}
