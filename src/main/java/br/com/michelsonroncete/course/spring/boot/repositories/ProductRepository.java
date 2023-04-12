package br.com.michelsonroncete.course.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.michelsonroncete.course.spring.boot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
