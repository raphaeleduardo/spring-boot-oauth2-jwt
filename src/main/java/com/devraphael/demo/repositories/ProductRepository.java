package com.devraphael.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devraphael.demo.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
