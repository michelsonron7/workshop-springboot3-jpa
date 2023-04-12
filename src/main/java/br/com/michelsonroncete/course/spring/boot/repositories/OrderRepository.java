package br.com.michelsonroncete.course.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.michelsonroncete.course.spring.boot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
