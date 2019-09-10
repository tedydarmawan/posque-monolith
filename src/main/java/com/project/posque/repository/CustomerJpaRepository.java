package com.project.posque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.posque.entity.Customer;

public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {

}
