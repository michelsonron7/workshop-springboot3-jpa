package br.com.michelsonroncete.course.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.michelsonroncete.course.spring.boot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
