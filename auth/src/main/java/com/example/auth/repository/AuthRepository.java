package com.example.auth.repository;

import com.example.cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth,Integer> {
}
