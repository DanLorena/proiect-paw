package com.example.magazinsportiv.repository;


import com.example.magazinsportiv.entity.Produs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdusRepository extends JpaRepository<Produs, Long> {
}
