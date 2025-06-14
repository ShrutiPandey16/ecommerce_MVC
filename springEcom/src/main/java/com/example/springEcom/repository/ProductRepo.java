package com.example.springEcom.repository;

import org.springframework.stereotype.Repository;

import com.example.springEcom.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{


}
