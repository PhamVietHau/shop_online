package com.example.Clothes_Shop_Online.repositories;

import com.example.Clothes_Shop_Online.entity.UseRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UseRole, Integer> {
}
