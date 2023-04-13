package br.com.michelsonroncete.course.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.michelsonroncete.course.spring.boot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
