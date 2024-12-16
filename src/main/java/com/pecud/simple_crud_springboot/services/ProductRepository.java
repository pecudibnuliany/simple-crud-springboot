package com.pecud.simple_crud_springboot.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pecud.simple_crud_springboot.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
