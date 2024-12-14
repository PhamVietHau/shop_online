package com.example.Clothes_Shop_Online.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "roles")
public class Roles {
    @Id
    private int id;
    private String role;
    @JsonIgnore
    @OneToMany(mappedBy = "roles")
    private List<UseRole> roles;


}
