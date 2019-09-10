package com.project.posque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.posque.entity.Product;

public interface ProductJpaRepository extends JpaRepository<Product, Integer>{

}
